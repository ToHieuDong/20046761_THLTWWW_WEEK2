package com.example.thltwww_week2.backend.configs;

import com.example.thltwww_week2.backend.enums.EmployeeStatus;
import com.example.thltwww_week2.backend.enums.ProductStatus;
import com.example.thltwww_week2.backend.models.Employee;
import com.example.thltwww_week2.backend.models.Product;
import com.example.thltwww_week2.backend.models.ProductImage;
import com.example.thltwww_week2.backend.repositories.EmployeeRepository;
import com.example.thltwww_week2.backend.repositories.ProductImgRepository;
import com.example.thltwww_week2.backend.repositories.ProductRepository;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import net.datafaker.Faker;
import org.jboss.jdeparser.JFor;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@ApplicationPath("/api")
public class ApplicationConfig extends Application {
    private EmployeeRepository repository = new EmployeeRepository();
    private ProductRepository productRepository = new ProductRepository();
    private ProductImgRepository productImgRepository = new ProductImgRepository();

    public ApplicationConfig() {
        for (int i = 0; i < 10; i++) {
            repository.addEmployee(new Employee("Name" + i, LocalDate.now(),
                    "hieudong.dongthanh." + i,
                    "Long An", "0859505384", EmployeeStatus.ACTIVE));
        }

        Random random = new Random();
        Faker faker = new Faker();
        List<String> listImg = List.of("https://cdn.phuckhangmobile.com/image/iphone-12-pro-max-128gb-vang-quocte-phuckhangmobile-27951j.jpg",
                "https://cdn2.cellphones.com.vn/insecure/rs:fill:358:358/q:80/plain/https://cellphones.com.vn/media/catalog/product/s/a/samsung-galaxy-s23-ultra.png",
                "https://cdn2.cellphones.com.vn/insecure/rs:fill:358:358/q:80/plain/https://cellphones.com.vn/media/catalog/product/r/e/reno10_5g_-_combo_product_-_blue.png",
                "https://cdn2.cellphones.com.vn/insecure/rs:fill:358:358/q:80/plain/https://cellphones.com.vn/media/catalog/product/r/e/reno10_5g_-_combo_product_-_blue.png",
                "https://cdn.phuckhangmobile.com/image/iphone-12-pro-max-128gb-vang-quocte-phuckhangmobile-27951j.jpg",
                "https://cdn.phuckhangmobile.com/image/samsung-galaxy-s20-plus-den-900-19416j.jpg",
                "https://cdn2.cellphones.com.vn/insecure/rs:fill:358:358/q:80/plain/https://cellphones.com.vn/media/catalog/product/s/a/samsung-galaxy-s23-ultra.png",
                "https://cdn2.cellphones.com.vn/insecure/rs:fill:358:358/q:80/plain/https://cellphones.com.vn/media/catalog/product/n/o/nokia-215-4g-600jpg-600x600.jpg",
                "https://cdn2.cellphones.com.vn/insecure/rs:fill:358:358/q:80/plain/https://cellphones.com.vn/media/catalog/product/n/o/nokia-c32_3_.png",
                "https://cdn2.cellphones.com.vn/insecure/rs:fill:358:358/q:80/plain/https://cellphones.com.vn/media/catalog/product/1/_/1_365-doc-quyuen.jpg");

        for (int i = 0; i < 10; i++) {
            System.out.println("ngungu");
            Product product = new Product(faker.device().modelName(),
                    faker.device().platform(),
                    faker.lorem().characters(10),
                    faker.device().manufacturer(),
                    ProductStatus.values()[random.nextInt(2)]);
            System.out.println(product);
            productRepository.addProduct(product);
            ProductImage productImage = new ProductImage(listImg.get(i), "Img " + i, product);
            productImgRepository.addProductImg(productImage);
        }
//				for (int i = 0; i < 10; i++) {
//					ProductImage  productImage = new ProductImage("");
//					productImageRepository.save(productImage);
//				}




    }
}
