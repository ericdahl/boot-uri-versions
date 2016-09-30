package example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactorService {

    public List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; n > 1; ++i) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        return factors;

    }
}
