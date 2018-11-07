import com.ehootu.sys.entity.SysUserRoleEntity;
import com.ehootu.sys.service.SysUserRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title:SysUserRoleTest
 * @Author: KongXiaoPing
 * @Date: 2018-03-21 09:26
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载spring配置文件
public class SysUserRoleTest {

    @Autowired
    private SysUserRoleService sysUserRoleService;
    @Test
    public  void  add(){
        for (Long i=101L; i<147; i++){
            SysUserRoleEntity sysUserRoleEntity = new SysUserRoleEntity();
            sysUserRoleEntity.setUserId(i);
            sysUserRoleEntity.setRoleId(3L);
            sysUserRoleService.save2(sysUserRoleEntity);
        }
    }
}