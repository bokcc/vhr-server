package club.bokcc.vhrserver.config;

import club.bokcc.vhrserver.model.Hr;
import club.bokcc.vhrserver.service.UserServiceImpl;
import club.bokcc.vhrserver.utils.RespBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.NonceExpiredException;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author : bokkcc
 * @since : 2023.01.01
 */
@Configuration
public class SecurityConfigure {
    private final UserServiceImpl userService;

    @Autowired
    public SecurityConfigure(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Bean
    public UserDetailsService configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
        return userService;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/home/**").permitAll()
                        .requestMatchers("/hello/**").authenticated()
                        .anyRequest()
                        .authenticated()
                )
                .formLogin(it -> it
                        .loginProcessingUrl("/doLogin")
                        .usernameParameter("username")
                        .passwordParameter("password")
                        .successHandler((request, response, authentication) -> {
                            response.setContentType("application/json;charset=utf-8");
                            var writer = response.getWriter();
                            var hr = (Hr) authentication.getPrincipal();
                            hr.setPassword("");
                            writer.write(new ObjectMapper().writeValueAsString(RespBean.ok("login success", hr)));
                            writer.flush();
                            writer.close();
                        })
                        .failureHandler(((request, response, exception) -> {
                            response.setContentType("application/json;charset=utf-8");
                            var writer = response.getWriter();
                            var respBean = RespBean.error(exception.getMessage());
                            if (exception instanceof LockedException) {
                                respBean.setMsg("????????????????????????????????????!");
                            } else if (exception instanceof CredentialsExpiredException) {
                                respBean.setMsg("?????????????????????????????????!");
                            } else if (exception instanceof NonceExpiredException) {
                                respBean.setMsg("?????????????????????????????????!");
                            } else if (exception instanceof DisabledException) {
                                respBean.setMsg("????????????????????????????????????!");
                            } else if (exception instanceof BadCredentialsException) {
                                respBean.setMsg("???????????????????????????????????????????????????!");
                            }
                            writer.write(new ObjectMapper().writeValueAsString(respBean));
                            writer.flush();
                            writer.close();
                        }))
                        .permitAll(true)
                )
                .logout(it -> {
                    it.logoutRequestMatcher(new AntPathRequestMatcher("/logout", "POST"));
                    it.logoutSuccessHandler(((request, response, authentication) -> {
                        response.setContentType("application/json;charset=utf-8");
                        var writer = response.getWriter();
                        var respBean = RespBean.ok("????????????");
                        writer.write(new ObjectMapper().writeValueAsString(respBean));
                        writer.flush();
                        writer.close();
                    }));
                })
                .exceptionHandling(it -> it.authenticationEntryPoint((request, response, authException) -> {
                    response.setContentType("application/json;charset=utf-8");
                    var writer = response.getWriter();
                    writer.write(new ObjectMapper().writeValueAsString(RespBean.error("???????????????????????????")));
                    writer.flush();
                    writer.close();
                }))
                .csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
