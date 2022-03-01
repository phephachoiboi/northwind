package fi.vamk.e2000593.northwind.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf()
        .disable()
        .authorizeRequests()
        .antMatchers("/", "/index")
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
        .httpBasic();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .ldapAuthentication()
                .userSearchFilter("uid={0}")
                .contextSource()
                .url("ldap://ldap.puv.fi:389/dc=puv,dc=fi");
    }
}
