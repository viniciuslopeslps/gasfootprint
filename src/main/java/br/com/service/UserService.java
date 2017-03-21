package br.com.service;

import br.com.dao.UserDAO;
import br.com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDAO.findOneByEmail(s);
    }

    public User save(User user) {
        return userDAO.save(user);
    }

    public User findOne(String email) {
        return userDAO.findOneByEmail(email);
    }
}
