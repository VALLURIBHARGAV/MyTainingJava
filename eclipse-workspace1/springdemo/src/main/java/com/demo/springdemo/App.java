package com.demo.springdemo;

import java.util.Scanner;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.springdemo.library.ProductComponent;

public class App {
//	@Autowired
//	private ProductComponent product;

	public static void main(String[] args) {
//	  ProductComponent product;
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguartion.class);
		ProductComponent product = context.getBean(ProductComponent.class);
		ProductComponent product1 = context.getBean(ProductComponent.class);
		ProductComponent product2 = context.getBean(ProductComponent.class);
		ProductComponent product3= context.getBean(ProductComponent.class);
		
//	  product.setCart();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the product");
			String prd = sc.nextLine();
			if (prd.equals("end")) {
				break;
			}
			System.out.println(product.viewAddProduct(prd));
			System.out.println(product1.viewAddProduct(prd));
			System.out.println(product2.viewAddProduct(prd));
			System.out.println(product3.viewAddProduct(prd));
			
		}
		sc.close();
		
	}
}
