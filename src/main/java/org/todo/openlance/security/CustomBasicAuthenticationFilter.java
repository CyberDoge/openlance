package org.todo.openlance.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
public class CustomBasicAuthenticationFilter extends BasicAuthenticationFilter {
    public CustomBasicAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }
}