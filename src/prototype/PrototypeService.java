package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeService {
    private Map map = new HashMap<>();
    public void register(String className, Product product) {
        map.put(className,product);
    }

    public Product create(String className) {
        Product product = (Product) map.get(className);
        return product.createClone();
    }
}
