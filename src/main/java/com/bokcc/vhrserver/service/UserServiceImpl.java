package com.bokcc.vhrserver.service;

import com.bokcc.vhrserver.mapper.HrMapper;
import com.bokcc.vhrserver.model.Hr;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author : bokkcc
 * @since : 2023.01.01
 */
@Service
public class UserServiceImpl implements UserDetailsService {
    private final HrMapper hrMapper;

    public UserServiceImpl(HrMapper hrMapper) {
        this.hrMapper = hrMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.findOneByUsername(username);
        if (null == hr) {
            throw new UsernameNotFoundException("用户名不存在!");
        }
        return hr;
    }
}
