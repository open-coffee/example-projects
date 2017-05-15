package coffee.synyx.example;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author  Tobias Schneider
 */
@Controller
public class ExampleController {

    @RequestMapping(method = RequestMethod.GET, value = { "/", "thymeleaf" })
    public String thymeleaf() {

        return "index-thymeleaf";
    }
}
