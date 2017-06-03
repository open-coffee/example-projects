package coffee.synyx.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author  Tobias Schneider
 */
@RestController
public class SecurityExampleController {

    @GetMapping("/")
    public String secret() {

        return "This is a secret";
    }


    @GetMapping("/not-secure")
    public String noSecret() {

        return "This is only secure with development mode";
    }


    @GetMapping("/admin")
    public String adminOnly() {

        return "This is for admins only in the integration mode";
    }
}
