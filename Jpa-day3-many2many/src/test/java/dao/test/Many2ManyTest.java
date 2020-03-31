package dao.test;

import dao.RoleDao;
import dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Role;
import pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Many2ManyTest {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    @Test
    public void testAdd(){
        User user = new User();
        Role role = new Role();
        user.setUserName("希望");
        role.setRoleName("学生");
        user.getUsers().add(role);
        role.getUsers().add(user);
        roleDao.save(role);
        userDao.save(user);
    }

    @Test
    public void testDel(){
        User user = new User();
        Role role = new Role();
        user.setUserName("希望");
        role.setRoleName("学生");

        roleDao.delete(1L);
    }
}
