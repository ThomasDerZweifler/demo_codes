package cf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by abhishekupadhyay on 2016/02/12.
 */
@SpringBootApplication
@RestController
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
class ResourceApplication extends ResourceServerConfigurerAdapter{
    public static void main(String[] args) {
        SpringApplication.run (ResourceApplication.class, args);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.anonymous().and().authorizeRequests().antMatchers("/resource/public/**").permitAll()
                .antMatchers("/resource/**").authenticated();

    }

}
