package com.example.jwt.security.token;

import com.example.jwt.security.dto.LoginDto;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class PreAuthorizationToken extends UsernamePasswordAuthenticationToken {

    private PreAuthorizationToken(String username, String password) {
        super(username, password);
    }

    public PreAuthorizationToken(LoginDto dto) {
        this(dto.getUsername(), dto.getPassword());
    }

    public String getUsername() {
        return (String) super.getPrincipal();
    }

    public String getUserPassword() {
        return (String) super.getCredentials();
    }
}