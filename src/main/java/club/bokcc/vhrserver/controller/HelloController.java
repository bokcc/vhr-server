package club.bokcc.vhrserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bokkcc
 * @since : 2023.01.01
 */
@RestController
@RequestMapping("/admin")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "welcome vhr";
    }
}
