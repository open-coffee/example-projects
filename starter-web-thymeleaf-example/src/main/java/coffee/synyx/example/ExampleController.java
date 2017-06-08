package coffee.synyx.example;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * @author  Tobias Schneider
 */
@Controller
public class ExampleController {

    @RequestMapping(method = GET, value = "/")
    public String thymeleaf() {

        return "index";
    }
}
