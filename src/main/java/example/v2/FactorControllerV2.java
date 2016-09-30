package example.v2;

import example.FactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/factors/v2", "/factors/beta", "/factors/latest"})
public class FactorControllerV2 {

    private final FactorService factorService;

    @Autowired
    public FactorControllerV2(FactorService factorService) {
        this.factorService = factorService;
    }

    @RequestMapping("/{n}")
    public FactorResponse factorize(@PathVariable int n) {
        return new FactorResponse(factorService.factorize(n), 111);
    }
}
