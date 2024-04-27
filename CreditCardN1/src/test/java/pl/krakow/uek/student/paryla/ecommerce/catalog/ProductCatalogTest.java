package pl.krakow.uek.student.paryla.ecommerce.catalog;

import org.junit.jupiter.api.Test;
import pl.krakow.uek.student.paryla.ecommerce.catalog.Product;
import pl.krakow.uek.student.paryla.ecommerce.catalog.ProductCatalog;
import static org.assertj.core.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

public class ProductCatalogTest {

    
    ProductCatalog catalog = thereIsProductCatalog();

    private ProductCatalog thereIsProductCatalog() {
return new ProductCatalog();
    }

    List<Product> product = catalog.allProducts();

    @Test
    public void itAllowsToListAvaiableProducts(){
        ProductCatalog catalog = thereIsProductCatalog();
        List<Product> products = catalog.findallProducts();

        assertThat(products).hasSize(0);
    }

    @Test
    public void itAllowsToLoadProductDetails(){
        ProductCatalog catalog = thereIsProductCatalog();

        String id = catalog.createProduct("Lego set 8083","nice one");
        Product loaded = catalog.getProductDetails(id);
        assertThat(loaded.getName()).isEqualTo("Lego set 8083");
    }

    @Test
    public void itChangePriceForProducts() {
        ProductCatalog catalog = thereIsProductCatalog();
        String id = catalog.createProduct("Lego set 8083","nice one");
        catalog.changePrice(id, BigDecimal.valueOf(10.10));
        Product loaded = catalog.getProductDetails(id);
        assertThat(loaded.getPrice()).isEqualTo(BigDecimal.valueOf(10.10));
    }

}
