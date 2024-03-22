package pl.krakow.uek.student.paryla.ecommerce.catalog;


import java.util.List;

public class ProductCatalogTest {

    
    ProductCatalog catalog = thereIsProductCatalog();

    private ProductCatalog thereIsProductCatalog() {
return new ProductCatalog();
    }

    List<Product> product = catalog.allProducts();

}
