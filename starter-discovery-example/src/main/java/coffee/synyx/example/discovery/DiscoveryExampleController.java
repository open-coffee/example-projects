package coffee.synyx.example.discovery;

import coffee.synyx.autoconfigure.discovery.service.AppQuery;
import coffee.synyx.autoconfigure.discovery.service.CoffeeNetApp;
import coffee.synyx.autoconfigure.discovery.service.CoffeeNetAppService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * @author  Tobias Schneider
 */
@RestController
public class DiscoveryExampleController {

    private final CoffeeNetAppService coffeeNetAppService;

    @Autowired
    public DiscoveryExampleController(CoffeeNetAppService coffeeNetAppService) {

        this.coffeeNetAppService = coffeeNetAppService;
    }

    @GetMapping(value = "/")
    public Map<String, List<CoffeeNetApp>> getApps() {

        return coffeeNetAppService.getApps();
    }


    @GetMapping(value = "/filtered")
    public Map<String, List<CoffeeNetApp>> getAppsFilter() {

        /*
         * Filtering is only implemented at the integration level and not in development
         */
        AppQuery query = AppQuery.builder().withRole("SPECIAL").build();

        return coffeeNetAppService.getApps(query);
    }
}
