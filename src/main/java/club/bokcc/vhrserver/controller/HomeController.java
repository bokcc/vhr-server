package club.bokcc.vhrserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bokkcc
 * @since : 2023.01.01
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String home() {
        return "HOMe";
    }

    @GetMapping("{uuid}")
    public String information(@PathVariable String uuid){
        return "你的信息码为" + uuid;
    }
}
