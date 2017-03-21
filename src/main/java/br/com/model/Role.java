package br.com.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

//a role precisa implementar o grantedAuthority
@Entity
public enum Role implements GrantedAuthority {
    ROLE_ADMIN("ROLE_ADMIN");

    @Id
    final String role;

    Role(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }
    //role pode ser: ADMIN,USER etc.
}