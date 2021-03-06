package com.ehootu.user.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.ApplicationUtils;
import com.ehootu.core.util.DateUtils;
import com.ehootu.core.util.ExcelUtil;
import com.ehootu.core.util.HttpRequest;
import com.ehootu.core.util.ShiroUtils;
import com.ehootu.sys.dao.SysUserRoleDao;
import com.ehootu.sys.entity.SysUserEntity;
import com.ehootu.sys.entity.SysUserRoleEntity;
import com.ehootu.sys.service.SysUserService;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.User;
import com.ehootu.user.service.UserService;
import com.google.code.kaptcha.Constants;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author KongXiaoPing
 * @version V1.0
 * @Title: UserController.java
 * @Package com.ehootu.web.controller
 * @Description: 登陆用户控制器
 * @date 2017年9月21日 下午2:42:41
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserRoleDao sysUserRoleDao;
    private final static Logger log = LoggerFactory.getLogger(UserController.class);


    /**
     * 用户登出
     *
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {

        ShiroUtils.logout();
        // 注销 Log
        return "redirect:/login.html";
    }

    /**
     * 广元智慧门牌微信服务号注册添加用户 | 修改用户信息
     *
     * @param user 电话号码
     */
    @RequestMapping("/weixinServer/adduser")
    public void addUser(User user) {
        log.info("电话号码--》" + user.getPhoneNumber());
        log.info("验证码--》" + user.getCode());
        try {
            //注册添加用户
            if (null == user.getId()) {
                // 判断是否有重复 根据电话查询
                List<User> personInfos = userService.findUser(user);
                if (null == personInfos || personInfos.size() == 0) {
//                    有验证码的时候用下面的
                    //获取验证码
//                    String random = (String) session.getAttribute("random");
//                    if (StringUtils.isNotBlank(random)){
//                        //比对验证码
//                        if (random.equals(user.getCode())){
//                            //设置密码
//                            user.setPassword(ApplicationUtils.sha256Hex(user.getPassword()));
//                            userService.insert(user);
//                            resultSuccess();
//                        }else {
//                            resultError("500", "验证码错误！");
//                        }
//                    }else {
//                        resultError("500", "session获取验证码为空！");
//                    }
                    //设置密码
                    user.setPassword(ApplicationUtils.md5(user.getPassword()));
                    userService.insert(user);
                    resultSuccess();
                } else {
                    resultError("500", "该用户已存在！");
                }
                // 修改用户
            } else {
                userService.update(user);
                resultSuccess();
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库操作异常");
        }
    }


    /**
     * 广元智慧门牌微信服务号 用户登录
     */
    @RequestMapping(value = "/weixinServer/login")
    public void weixinServerLogin(User user) {
        try {
            log.info("PersonInfo--》" + user);
            log.info("userName--》" + user.getUserName());
            log.info("userPassword--》" + user.getPassword());
            log.info("code--》" + user.getCode());
            log.info("winxinId--》" + user.getWeixinId());

            // 根据登陆电话查询
            List<User> personInfos = userService.findUser(user);

            if (null == personInfos || personInfos.size() == 0) {
                resultError("500", "您还没有注册哦,请注册！");
                return;
            } else {
                log.info("PersonInfo--" + user);
//                //获取后台验证码
//                String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
//                //对比接收到的验证码和session中存的验证码
//                if (!user.getCode().equalsIgnoreCase(kaptcha)) {
//                    resultError("500", "验证码不正确");
//                    return;
//                }
                // 身份验证 sha256 加密
                user.setPassword(ApplicationUtils.md5(user.getPassword()));
                User result = userService.login(user);
                if (result != null) {
                    result.setLoginSign(result.getId());
                    resultSuccess(result);
                } else {
                    resultError("500", "用户名或密码错误！");
                }
            }
        } catch (AuthenticationException e) {
            // 身份验证失败
            e.printStackTrace();
            resultError("500", "用户名或密码错误！");
        }
    }

    /**
     * 微信公众号端用户登录
     */
    @RequestMapping(value = "/app/loginSign")
    public void appNoLogin(User user) {
        if (user.getLoginSign() != null) {
            User result = userService.selectById(user.getLoginSign());
            if (result != null) {
                resultSuccess(result);
                return;
            }
        }
        resultError("11", "用户名信息已过期！");
    }

    /**
     * 广元智慧门牌 警察app端用户登录
     */
    @RequestMapping(value = "/app/policelogin")
    public void policeLogin(Police police) {
        String passWord = police.getPolicePassword();
        log.info("policeLogin========>" + police);
        try {
            Session s = ShiroUtils.getSession();
            log.info("s========>" + s);
            //获取后台验证码
            String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
            log.info("kaptcha========>" + kaptcha);
            //对比接收到的验证码和session中存的验证码
            if (!police.getCode().equalsIgnoreCase(kaptcha)) {
                resultError("2", "验证码不正确");
                return;
            }
            //将接收到的密码加密
            police.setPolicePassword(ApplicationUtils.md5(police.getPolicePassword()));
            //验证码正确将去数据库查询是否存在该用户
            Police result = userService.policeLogin(police);
            //result！=null 证明数据库有该用户则返回，否则返回else
            if (result != null) {
                //返回不加密的秘码给前端
                result.setPolicePassword(passWord);
                resultSuccess(result);
            } else {
                resultError("11", "用户名或密码错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultError("11", "数据库操作异常");
        }
    }

    /**
     * 广元智慧门牌微信服务号 用户修改密码
     * @param params oldPassword 旧密码
     *               password 新密码
     *               id 用户id
     */
    @RequestMapping(value = "/updatePassword")
    public void updatePassword(@RequestParam Map<String,Object> params){
        //用户id
        String userId = (String) params.get("id");
        //旧密码
        String oldPassword = (String)params.get("oldPassword");
        //新密码
        String password = (String)params.get("password");
        //根据用户id查询用户
        User user = userService.selectById(userId);
        //加密
        String md5OldPassword = ApplicationUtils.md5(oldPassword);
        //判断旧密码是否正确 ,正确，则修改密码
        if (md5OldPassword.equals(user.getPassword())){
            user.setPassword(ApplicationUtils.md5(password));
            user.setId(userId);
            //修改密码
            userService.update(user);
            resultSuccess();
        }else {
            resultError("500","旧密码错误，请再次输入");
        }

    }

    /**
     *广元智慧门牌微信服务号 根据用户id查询个人资料
     * @param id
     */
    @RequestMapping(value = "/queryPersonInfoById")
    public void  queryPersonInfoById(String id){
        try {
            User user = userService.selectById(id);
            resultSuccess(user);
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }

    }







    /**
     *微信服务号发短信获取验证码
     * @param
     */
    @RequestMapping(value = "/sendMsg")
    public void  sendMsg(String phoneNumber){
        try {
            /*userid	用户名 410245
            timespan	时间戳	格式为yyyyMMddHHmmss
            pwd	密码 	此处用原始密码(964073)+时间戳做MD5加密，32位大写格式
                    (+号为连接符)
            mobile	手机号	多个用英文逗号隔开
            msgfmt	编码类型	选填，如果不填默认为GBK，可以选填GBK或者UTF8/UTF-8
            content	内容	做base64加密操作,编码方式使用msgfmt中的方式，如果msgfmt有值的话  【德阳区划地名网】
            ext	扩展	选填, 纯数字
            具体支持位数咨询客服
            msgid	唯一标识	选填，纯数字，如果不填系统自动生成作为当前批次的唯一标识
            attime	定时时间	选填，2008-06-09 12:00:00*/
            //时间戳
            String timespan = DateUtils.formatDate(new Date(), "yyyyMMddHHmmss");
            //密码 大写 此处用原始密码(964073)+时间戳做MD5加密，32位大写格式
            String pwd = ApplicationUtils.md5Hex("964073"+timespan).toUpperCase();
            log.info("md5加密后大写密码---》"+pwd);
            //验证码 随机6位数
            String random = (int)((Math.random()*9+1)*100000)+"";
            log.info("随机6位数验证码---》"+random);
            //把验证码存session中
            session.setAttribute("random",random);
            log.info("短信签名---》"+HttpRequest.SEND_MESSAGE_SIGNATURE);
            //短信内容  = 签名+随机验证码
            String msgContent = HttpRequest.SEND_MESSAGE_SIGNATURE+" 注册广元经开服务号验证码："+random;
            //base64加密
            String content = new BASE64Encoder().encodeBuffer(msgContent.getBytes());
            log.info("base64加密后的短信内容content---》"+content);

            // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
            String param = "userid=" + URLEncoder.encode("410245", "utf-8") + "&timespan="
                    + URLEncoder.encode(timespan, "utf-8") + "&pwd="
                    + URLEncoder.encode(pwd, "utf-8") + "&mobile="
                    + URLEncoder.encode(phoneNumber, "utf-8")+ "&content="
                    + URLEncoder.encode(content, "GBK");
            //调发短信接口
            String resultSendMsg = HttpRequest.sendGet(HttpRequest.URL_SEND_MESSAGE, param);
            log.info("resultSendMsg---》"+resultSendMsg);
            resultSuccess(resultSendMsg);
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }
    }

    /**
     * 导入警察数据
     *
     * @param
     */
    @RequestMapping(value = "/daoRuDz")
    public void readExcel() {
//    public void readExcel(MultipartFile file){
//    public void readExcel(InputStream is){

        try {

//            FileInputStream fis = new FileInputStream(file);
//            FileInputStream file = new FileInputStream("E:\\kxp\\echootu\\201708月地名基库项目\\地址信息表.xls");
            File file = new File("E:\\kxp\\echootu\\广元智慧门牌项目\\集成警务平台数据库police.xlsx");

            long start = System.currentTimeMillis();
            ExcelUtil<Police> excelUtil = new ExcelUtil<>(Police.class);
            //将excel表单数据源的数据导入到list
            List<Police> policeList = excelUtil.getExcelToList("警察数据", file);
            if (null != policeList){
                for (Police police : policeList) {

                    System.out.println(police.toString());
                    userService.savePolice(police);
                }
            }
            System.out.println("----执行完毕----");
            System.out.println("已耗时：" + ((System.currentTimeMillis()-start) / 1000)+"秒");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    /**
     * 导入PC端系统登录表数据
     *
     * @param
     */
    @RequestMapping(value = "/daoRuDz2")
    public void readExcel2() {
//    public void readExcel(MultipartFile file){
//    public void readExcel(InputStream is){

        try {

//            FileInputStream fis = new FileInputStream(file);
//            FileInputStream file = new FileInputStream("E:\\kxp\\echootu\\201708月地名基库项目\\地址信息表.xls");
            File file = new File("E:\\kxp\\echootu\\广元智慧门牌项目\\集成警务平台数据库sysUser.xlsx");

            long start = System.currentTimeMillis();
            ExcelUtil<SysUserEntity> excelUtil = new ExcelUtil<>(SysUserEntity.class);
            //将excel表单数据源的数据导入到list
            List<SysUserEntity> sysUserList = excelUtil.getExcelToList("警察数据", file);
            if (null != sysUserList){
                for (SysUserEntity sysUser : sysUserList) {

                    System.out.println(sysUser.toString());
                    sysUserService.saveSysUser(sysUser);
                }
            }
            System.out.println("----执行完毕----");
            System.out.println("已耗时：" + ((System.currentTimeMillis()-start) / 1000)+"秒");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @RequestMapping(value = "/daoRuDz3")
    public void addSysUserRole() {

        for (Long i=101L; i<147; i++){
            SysUserRoleEntity sysUserRoleEntity = new SysUserRoleEntity();
            sysUserRoleEntity.setUserId(i);
            sysUserRoleEntity.setRoleId(3L);
            sysUserRoleDao.save2(sysUserRoleEntity);
        }

    }

}
