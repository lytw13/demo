package com.lytw13.demo.config;//package com.lytw13.demo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class MySecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("admin").password(passwordEncoder().encode("123456")).roles("user");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        // 禁用csrf
//        http.csrf().disable()
//                .formLogin().loginPage("/loginPage").usernameParameter("name").passwordParameter("password").loginProcessingUrl("loginPage").successHandler(myAuthenticationSuccessHandler())
//        .and().authorizeRequests()
//
//                //登录注册注销方法放行
//                .antMatchers("/loginPage","/logout").permitAll()
//                //静态资源放行
//                .antMatchers("/css/**","/js/**","/images/**","/json/**","/layui/**").permitAll()
//
//                // swagger 文档
//                .antMatchers("/swagger-ui.html").permitAll()
//                // 阿里巴巴 druid
//                .antMatchers("/druid/**").permitAll()
//                // 其他请求需要认证
//                .anyRequest().authenticated();
//    }
//
//    private PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public MyAuthenticationSuccessHandler myAuthenticationSuccessHandler() {
//        return new MyAuthenticationSuccessHandler();
//    }
//}
