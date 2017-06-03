package coffee.synyx.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static java.lang.invoke.MethodHandles.lookup;


/**
 * @author  Tobias Schneider
 */
@RestController
public class LoggingExampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(lookup().lookupClass());

    @GetMapping(value = "/")
    public String getApps() {

        LOGGER.info("This is a log.");
        LOGGER.warn("This is a log with random stuff {}", new Random().nextDouble());

        return "Successfully logged";
    }
}
