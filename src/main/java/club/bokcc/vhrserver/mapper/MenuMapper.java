package club.bokcc.vhrserver.mapper;

import club.bokcc.vhrserver.model.Menu;

import java.util.List;

/**
* @author xiaowang
* @description 针对表【menu】的数据库操作Mapper
* @createDate 2023-01-01 10:21:08
* @Entity club.bokcc.vhrserver.model.Menu
*/
public interface MenuMapper {

    List<Menu> getMenusByHrId(Integer id);
}




