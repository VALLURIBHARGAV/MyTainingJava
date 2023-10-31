package com.demo.springdemo.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.demo.springdemo.SpringConfiguartion;

@Component
//@Scope(value = "prototype")
public class ProductComponent {
//	CartComponent cart = new CartComponent();
//	public List<String> viewAddProduct(String prdname){
//		return cart.addProduct(prdname);
//	}
	@Autowired
	CartComponent cart;
	public ProductComponent() {
		System.out.println("Product object is created");
	}
	
//	public ProductComponent(CartComponent cart) {
//		this.cart = cart;
//	}

//	public void setCart() {
//ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguartion.class);
//	cart = context.getBean(CartComponent.class);
//	}
	@Value("${cname}")
	String cname;
	
	public List<String> viewAddProduct(String prdname){
		return cart.addProduct(cname + ":" +prdname);
	}
}
