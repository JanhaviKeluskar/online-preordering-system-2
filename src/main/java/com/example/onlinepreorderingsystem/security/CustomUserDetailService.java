package com.example.onlinepreorderingsystem.security;

import com.example.onlinepreorderingsystem.dao.UserDao;
import com.example.onlinepreorderingsystem.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UserDao userRepo;

    public CustomUserDetailService(UserDao userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {
        User user = userRepo.getByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid User");
        }
        else
        {
            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            if(user.getAdmin())
            {
                grantedAuthorities.add(
                        new SimpleGrantedAuthority("ROLE_ADMIN"));
            }
            else
            {
                grantedAuthorities.add(
                        new SimpleGrantedAuthority("ROLE_CUSTOMER"));
            }

            return new org
                    .springframework
                    .security
                    .core
                    .userdetails
                    .User(user.getEmail(), user.getPassword(), grantedAuthorities);

        }
    }
}