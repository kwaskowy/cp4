package pl.krakow.uek.student.paryla.ecommerce.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

public class App {
    public static void main(String[] args) {
        System.out.println("Here we go!");
        SpringApplication.run(App.class,args);
    }

    @Bean
    ProductCatalog createMyProductCatalog() {
        var catalog = new ProductCatalog();
        catalog.createProduct("Lego Set","nice one");
        catalog.createProduct("Cobi Set","fresh one");
        return catalog;
    }
}
