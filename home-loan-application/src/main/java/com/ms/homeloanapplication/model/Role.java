package com.ms.homeloanapplication.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_ADMIN,ROLE_CLIENT;
    public String getAuthority(){
        return name();
    }
}