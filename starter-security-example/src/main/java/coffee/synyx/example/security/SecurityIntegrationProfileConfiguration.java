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
class SecurityIntegrationProfileConfiguration extends IntegrationCoffeeNetWebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        //J-
        enableSso(http)
            .authorizeRequests()
                .antMatchers("/not-secure").permitAll()
                .antMatchers("/admin").hasRole("COFFEENET-ADMIN")
                .antMatchers("/**").authenticated()
            .and()
                .csrf().disable();
        //J+
    }
}
