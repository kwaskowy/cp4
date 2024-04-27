package pl.krakow.uek.student.paryla.ecommerce.catalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class ProductCatalogController {


    ProductCatalog productCatalog;

    public ProductCatalogController(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @GetMapping("/api/hello")
    String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/api/products")
    List<Product> getProducts(){
        return Collections.emptyList();
    }

    @GetMapping("/api/names")
    List<String> getNames(){
        return Arrays.asList("Kuba","Michal","Jacek");
    }
}