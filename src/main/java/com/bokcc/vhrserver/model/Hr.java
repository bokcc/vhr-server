package com.bokcc.vhrserver.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author xiaowang
 * @TableName hr
 */
@Data
public class Hr implements Serializable, UserDetails {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String phone;
    private String telephone;
    private String address;
    private Integer enabled;
    private String username;
    private String password;
    private String userface;
    private String remark;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}