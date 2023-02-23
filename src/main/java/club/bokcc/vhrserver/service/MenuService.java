package club.bokcc.vhrserver.service;

import club.bokcc.vhrserver.controller.SystemConfigController;
import club.bokcc.vhrserver.mapper.MenuMapper;
import club.bokcc.vhrserver.model.Hr;
import club.bokcc.vhrserver.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : bokkcc
 * @since : 2023.02.23
 */
@Service
public class MenuService {
    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
