package com.demo.springdemo;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//import com.demo.springdemo.library.CartComponent;
//import com.demo.springdemo.library.ProductComponent;

@Configuration
@ComponentScan(basePackages = {"com.demo.springdemo"})
@PropertySource(value = {"classpath:/application.properties"})
public class SpringConfiguartion {
//	@Bean
//	public ProductComponent getProduct() {
//		return new ProductComponent();
//	}
//
//	@Bean
//	public CartComponent getCart() {
//		return new CartComponent();
//	}
}
