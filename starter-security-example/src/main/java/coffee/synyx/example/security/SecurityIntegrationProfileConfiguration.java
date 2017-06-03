package coffee.synyx.example.security;

import coffee.synyx.autoconfigure.security.config.IntegrationCoffeeNetWebSecurityConfigurerAdapter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;


/**
 * @author  Tobias Schneider
 */
@Configuration
@ConditionalOnProperty(prefix = "coffeenet", name = "profile", havingValue = "integration")
public class SecurityIntegrationProfileConfiguration extends IntegrationCoffeeNetWebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        enableSso(http).authorizeRequests()
            .antMatchers("/admin")
            .hasRole("COFFEENET-ADMIN")
            .and()
            .authorizeRequests()
            .antMatchers("/not-secure")
            .permitAll()
            .and()
            .authorizeRequests()
            .antMatchers("/**")
            .authenticated()
            .and()
            .csrf()
            .disable();
    }
}
