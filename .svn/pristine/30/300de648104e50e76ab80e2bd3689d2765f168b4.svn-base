package com.ehootu.user.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.ApplicationUtils;
import com.ehootu.core.util.R;
import com.ehootu.core.util.ShiroUtils;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.User;
import com.ehootu.user.service.PoliceService;
import com.ehootu.user.service.UserService;
import com.google.code.kaptcha.Constants;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyong
 * @version V1.0
 * @Title: PoliceController.java
 * @Package com.ehootu.web.controller
 * @Description: 警察控制器
 * @date 2017年9月21日 下午2:42:41
 */
@Controller
@RequestMapping(value = "/police")
public class PoliceController extends BaseController {
    @Autowired
    private PoliceService policeService;

    private final static Logger log = LoggerFactory.getLogger(PoliceController.class);


    /**
     * 通id查询出
     * @param id
     */
    @RequestMapping(value = "/list/{id}")
    public void list(@PathVariable("id") String id){
        log.info("查询id:"+id);
        Police police = policeService.selectById(id);
        List<Police> policeList = null;
        if (police!=null){
            policeList = policeService.policeListByPolice(police);
        }
        resultSuccess(policeList);
    }

    @PostMapping("/login")
    public void login(Police police){
        try {
//            Police police = getJsonAjax(data, Police.class);
            Subject subject = ShiroUtils.getSubject();
            log.info(""+police);
            // 验证码
            String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
            if (!police.getCode().equalsIgnoreCase(kaptcha)) {
                resultError("2", "验证码不正确");
                return;
            }
            // 身份验证 sha256 加密
            police.setPolicePassword(ApplicationUtils.sha256Hex(police.getPolicePassword()));

            // 验证成功在Session中保存用户信息

            subject.login(new UsernamePasswordToken(police.getPoliceNumber(), police.getPolicePassword()));
            Police result = policeService.login(police);
            request.getSession().setAttribute("police", result);
            // 插入登录 Log
            // 返回成功
            resultSuccess(result);

        } catch (AuthenticationException e) {
            // 身份验证失败
            e.printStackTrace();
            resultError("11", "用户名或密码错误！");
        }
    }


    @RequestMapping("/all/list")
    @ResponseBody
    public R policeList(){
        List<Police> list = policeService.policeList();
        Police police = new Police();
        police.setId("0");
        police.setName("警员信息表");
        List<Police> result = new ArrayList<>();
//        result.add(police);
        for(Police police1: list){
            police1.setParentId("0");
            police1.setName(police1.getPoliceName());
            result.add(police1);
        }
        return R.ok().put("list",result);
    }


}
