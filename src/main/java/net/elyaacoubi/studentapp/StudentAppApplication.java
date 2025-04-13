package net.elyaacoubi.studentapp;

import net.elyaacoubi.studentapp.entities.Product;
import net.elyaacoubi.studentapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentAppApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //productRepository.save(new Product(null,"computer",4300,3));
        //productRepository.save(new Product(null,"printer",1500,8));
        //productRepository.save(new Product(null,"smartphone",3000,7));
        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("**********");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println("**********");
        System.out.println("--------------");
        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p->{
            System.out.println(p);

        });
        System.out.println("--------------------");
        List<Product> productList2 = productRepository.search("%C%");
        productList2.forEach(p->{
            System.out.println(p);

        });
        System.out.println("--------------------");
        List<Product> productList3 = productRepository.searchByPrice(3000);
        productList3.forEach(p->{
            System.out.println(p);

        });
    }
}
