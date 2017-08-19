package test.com.lug.service;

import com.lug.mybatis.model.User;
import com.lug.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@ContextConfiguration(locations = {"classpath:spring/applicationContext-mybatis.xml"})
@RunWith( SpringJUnit4ClassRunner.class)
public class UserServiceTest extends AbstractJUnit4SpringContextTests{
    @Resource(name="userService")
    private UserService service;


    @Test
    public void findAllByTypeOneTest(){
        List<User> list = service.findAllByTypeOne();
        System.out.println(list.size());
    }

    @Test
    public void TypeTwoSaveTest(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setUsername("zhangsan");
        user.setPassword("password");
        user.setPhone("13516269745");
        service.saveTwo(user);
    }

    @Test
    public void typeOneSaveTest(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setUsername("zhangsan");
        user.setPassword("password");
        user.setPhone("13516269745");
        service.saveOne(user);
    }




    @Test
    public void userSaveTest(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setUsername("zhangsan");
        user.setPassword("password");
        user.setPhone("13516269745");
        service.save(user);
    }


    @Test
    public void saveDaoTest(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setUsername("zhangsan");
        user.setPassword("password");
        user.setPhone("13516269745");
        service.saveDao(user);
    }
}
