package test.com.lug.service;

import com.github.pagehelper.PageInfo;
import com.lug.mybatis.model.Page;
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
    public void findPageTest(){
        com.github.pagehelper.Page<User> page =  service.findPage(null);
        long size = page.getPageNum();
        long sizePage = page.getPageSize();
        long sizeTotal = page.getTotal();
        System.out.println(size);
        System.out.println("sizePage;"+sizePage+"_total:"+sizeTotal);
    }
    @Test
    public void update(){
        User u = new User();
        u.setPhone("13516269845");
        u.setUsername("lug");
        u.setPassword("sdfsdf");
        u.setId("b38d12b4f5ee467395df83027de103f9");
        long size = service.update(u);
        System.out.println("--------------");
        System.out.println(size);
        System.out.println("--------------");
    }


    @Test
    public void deleteByPhone(){
        String phone = "13516269745";
        long size = service.deleteByPhone(phone);
        System.out.println(size);
    }


    @Test
    public void deleteByIdTest(){
        String id = "0b1e6399349f484092add3557dd1c3ee";
        long l =  service.deleteById(id);
        System.out.println(l);
    }



    @Test
    public void findAllRowBoundsTest(){
        List<User> list = service.findAllByDefault(null);
        System.out.println(list.size());
    }



    @Test
    public void findCountTest(){
        System.out.println("--------------");
        System.out.println(service.findCount());
        System.out.println("--------------");
    }


    @Test
    public void findAllByPageInfo(){
        PageInfo<User> pageInfo  = service.findAllByPageInfo();
        long endRow = pageInfo.getEndRow();
        long userSize = pageInfo.getList().size();
        long total = pageInfo.getTotal();
        System.out.println("endRow:"+endRow+":userSize:"+userSize+":total:"+total);
    }

    @Test
    public void findAllByLambdaTest(){
        com.github.pagehelper.Page<User> page = service.findAllBylambda();
        long pageSize =  page.getPageSize();
        long pageNum = page.getPageNum();
        long total = page.getTotal();
        System.out.println("total:"+total+"-pageSize:"+pageSize+"-pageNum:"+pageNum);
    }

    @Test
    public void findAllByInterface(){
        com.github.pagehelper.Page<User> page = service.findAllByInterface();
        long total = page.getTotal();
        long pageNum = page.getPageNum();
        long pageSize = page.getPageSize();
        System.out.println("total:"+total +"-pageNum:"+pageNum+"-pageSize:"+pageSize);
    }


    @Test
    public void findAllByPage(){
        Page<User> page = new Page<User>();
        page.setPageSize(15);
        List<User> list = service.findAllByPage(page);
        long size = list.size();
        System.out.println(size);
    }


    @Test
    public void findAllByTypeThreeWithParamTest(){
        List<User> list = service.findAllByTypeThreeWithParam(0,0);
        int size = list.size();
        System.out.println(size);
    }

    @Test
    public void findAllByTypeThreeOneTest(){
        List<User> list = service.findAllTypeThreeOne();
        int size = list.size();
        System.out.println(size);
    }

    @Test
    public void findAllByTypeThree(){
        List<User> list = service.findAllTypeThree();
        int size = list.size();
        System.out.println(size);
    }


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
