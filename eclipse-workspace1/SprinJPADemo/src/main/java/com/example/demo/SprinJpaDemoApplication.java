package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRespository;

@SpringBootApplication
public class SprinJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinJpaDemoApplication.class, args);
	}

    @Bean
    CommandLineRunner demo(ProductRespository repository) {
		return(args)->{
			repository.save(new Product("Java","Book",700));
			repository.save(new Product("Python","Book",1700));
			repository.save(new Product("c Sharp","Book",900));
			repository.save(new Product("Spring","Book",800));
			Product myPrd=repository.findById(2).get();
			myPrd.setPrdName("SpringCore");
			myPrd.setPrdPrice(2300);
			repository.save(myPrd);
			System.out.println(myPrd);
			System.out.println("Product Listing");
			repository.findAll().forEach(System.out::println);
		};
	}
}
