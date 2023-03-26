package com.ksun.springbootsecurityrest.jwtutils.model;

import java.io.Serializable;
public class JwtResponseModel implements Serializable {
    private static final long serialVersionUID = -839460409390056505L;
    /**
     *
     */

    private final String token;
    public JwtResponseModel(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }
}