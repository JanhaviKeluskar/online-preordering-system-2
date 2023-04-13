package com.example.onlinepreorderingsystem.security;

import com.example.onlinepreorderingsystem.dao.ConfigDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class AdminSecurityConfig
{
    @Autowired
    ConfigDao configDao;

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/assets/**", "/customer/**").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                //    .loginPage("customLoginPage.html")
                //    .usernameParameter("customHtmlNameValueForUsername")
                //    .passwordParameter("customHtmlNameValueForPassword")
                //    .loginProcessingUrl("/login")
                .defaultSuccessUrl("/admin/dashboard/", true)
                .and()
                .logout().invalidateHttpSession(true).clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/").permitAll()
                .and()
                .rememberMe().rememberMeParameter("remember_me").key("mySecreteKey").tokenValiditySeconds(60 * 60 * 60 * 24 * 7);

        return http.build();
    }

    @Bean
    protected UserDetailsService userDetailsService() {
        List<UserDetails> listUser = new ArrayList<>();
        listUser.add(
                User.builder()
                        .username(configDao.getVal("username"))
                        .password(getPasswordEncoder().encode(configDao.getVal("password")))
                        .roles("ADMIN")
                        .build()
        );

        return new InMemoryUserDetailsManager(listUser);
    }


    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}

