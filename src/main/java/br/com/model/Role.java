package br.com.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//a role precisa implementar o grantedAuthority
public class Role implements GrantedAuthority {
    //role pode ser: ADMIN,USER etc.
    @Id
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }
}