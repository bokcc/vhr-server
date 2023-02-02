package club.bokcc.vhrserver.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : bokkcc
 * @since : 2023.01.01
 */
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;


    @Test
    void loadUserByUsername() {
        var admin = userService.loadUserByUsername("admin");
        System.out.println("admin = " + admin);
    }
}