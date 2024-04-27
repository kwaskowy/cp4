package pl.krakow.uek.student.paryla.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    public List<Product> allProducts() {
        return new ArrayList<>();
    }

    public List<Product> findallProducts() {
        return null;
    }

    public String createProduct(String productName, String productDescription) {
        return productName;
    }

    public Product getProductDetails(String id) {
        return null;
    }

    public void changePrice(String id, BigDecimal bigDecimal) {
    }
}
