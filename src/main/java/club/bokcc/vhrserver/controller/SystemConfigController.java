package club.bokcc.vhrserver.controller;

import club.bokcc.vhrserver.model.Menu;
import club.bokcc.vhrserver.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : bokkcc
 * @since : 2023.02.23
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    private MenuService menuService;
    public SystemConfigController(MenuService menuService){
       this.menuService = menuService;
    }

    @GetMapping("menu")
    public List<Menu> getMenusByHrId(){
        return menuService.getMenusByHrId();
    }
}
