package com.domain.spicy;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.spicy.domain.Users;
import com.spicy.domain.UsersDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/applicationContext-hibernate.xml"})
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/applicationContext-acegi-security.xml", "file:src/main/webapp/WEB-INF/applicationContext-hibernate.xml", "file:src/main/webapp/WEB-INF/applicationContext.xml"})
@TransactionConfiguration(transactionManager="txManager", defaultRollback=false)
@Transactional
public class UsersDAOTest { 
//        AbstractHibernateTransactionalTest {
    private static final Logger log = Logger
            .getLogger(UsersDAOTest.class);

    private static final String A = "dsafd";
    private static final String B = "324234234";

    @Autowired
    @Qualifier(value="spicyUsersDAO")
    private UsersDAO usersDAO;

    @Test
    public void testSave() {
        
        String cwd = System.getProperty("user.dir");
        log.debug(cwd);
        Users u = new Users();
        u.setName("testname");


        usersDAO.save(u);
        
        List<Users> list = usersDAO.findAll();
        assertEquals(0, list.size());
    }
//    public void testGetUserByUsername() {
//        String USER = "test";
//        User u = userDAO.getUserByUsername(USER);
//        assertEquals(USER, u.getUsername());
//
//    }
//
//    public void testLoadUserByUsername() {
//        String USER = "test";
//        ServerSideUser u = userDAO.loadUserByUsername(USER);
//        assertEquals(USER, u.getUsername());
//
//    }
//
//    public void testSave() {
//
//        User u = new User();
//        u.setUsername(A);
//        u.setPassword(A);
//        u.setNickname(A);
//
//        List<User> list = userDAO.getAllUsers();
//
//        userDAO.save(u);
//
//        User saved = userDAO.getUserByUsername(A);
//
//        assertEquals(A, saved.getUsername());
//        assertNotSame(0, saved.getId());
//        assertFalse(saved.isSupervisor());
//        assertTrue(saved.isEnabled());
//        assertTrue(saved.isAccountNonExpired());
//
//        List<User> listPost = userDAO.getAllUsers();
//
//        assertEquals(listPost.size(), list.size() + 1);
//        log.debug("User list size " + list.size());
//    }
//
//    public void testEdit() {
//        String A = "dsafd";
//        String B = "sdfn&S*AS";
//
//        User u = new User();
//        u.setUsername(A);
//        u.setPassword(B);
//        u.setNickname(A);
//        List<User> list = userDAO.getAllUsers();
//
//        userDAO.save(u);
//
//        User saved = userDAO.getUserByUsername(A);
//
//        assertEquals(A, saved.getUsername());
//        assertNotSame(0, saved.getId());
//        assertFalse(saved.isSupervisor());
//        assertTrue(saved.isEnabled());
//        assertTrue(saved.isAccountNonExpired());
//
//        List<User> listPost = userDAO.getAllUsers();
//
//        assertEquals(listPost.size(), list.size() + 1);
//        log.debug("User list size " + list.size());
//
//        // now do some edits
//        //
//        saved.setUsername(B);
//        saved.setSupervisor(true);
//        assertEquals(B, saved.getUsername());
//        saved = userDAO.save(saved);
//        assertEquals(B, saved.getUsername());
//
//        for (User uuu : userDAO.getAllUsers()) {
//            System.out.println("AAAAAA " + uuu);
//        }
//        User editted = userDAO.getUserByUsername(B);
//
//        assertNotNull(editted);
//        assertEquals(B, editted.getUsername());
//        assertSame(saved.getId(), editted.getId());
//        assertTrue(saved.isSupervisor());
//        assertTrue(saved.isEnabled());
//        assertTrue(saved.isAccountNonExpired());
//
//    }
//
//    public void testGetUserCount() {
//
//        List<User> list = userDAO.getAllUsers();
//
//        long pre = userDAO.getUserCount();
//
//        assertEquals(pre, list.size());
//
//        User u = new User();
//        u.setUsername(A);
//        u.setPassword(B);
//        u.setNickname(A);
//        userDAO.save(u);
//
//        assertEquals(pre + 1, userDAO.getUserCount());
//
//    }
//
//    public void testGetUserByNicknameFetchAll() {
//        User u = new User();
//        u.setUsername(A);
//        u.setPassword(A);
//        u.setNickname(A);
//        // List<User> list = userDAO.getAllUsers();
//
//        userDAO.save(u);
//
//        User saved = userDAO.getUserByNicknameFetchAll(A);
//
//        assertTrue(Hibernate.isInitialized(saved.getSchoolRankings()));
//
//        User test = userDAO.getUserByNicknameFetchAll("test");
//        assertTrue(Hibernate.isInitialized(test.getSchoolRankings()));
//
//        for (Application sap : test.getSchoolRankings()) {
//            assertTrue(Hibernate.isInitialized(sap));
//            assertTrue(Hibernate.isInitialized(sap.getSchool()));
//
//        }
//
//    }

}
