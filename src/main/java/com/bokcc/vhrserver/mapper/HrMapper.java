package com.bokcc.vhrserver.mapper;

import com.bokcc.vhrserver.model.Hr;

/**
 * @author xiaowang
 * @description 针对表【hr】的数据库操作Mapper
 * @createDate 2023-01-01 10:21:08
 * @Entity com.bokcc.vhrserver.model.Hr
 */
public interface HrMapper {
    Hr findOneByUsername(String username);
}




