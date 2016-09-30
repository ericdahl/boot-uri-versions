package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/factors/v1", "/factors/stable"})
public class FactorController {

    private final FactorService factorService;

    @Autowired
    public FactorController(FactorService factorService) {
        this.factorService = factorService;
    }

    @RequestMapping("/{n}")
    public List<Integer> factorize(@PathVariable int n) {
        return factorService.factorize(n);
    }
}
