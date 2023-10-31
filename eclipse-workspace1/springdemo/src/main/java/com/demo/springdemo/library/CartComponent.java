package com.demo.springdemo.library;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class CartComponent {
//	private ProductComponent productComponent;

  public CartComponent() {
	  System.out.println("Cart object is created");
  }
//    public CartComponent(ProductComponent productComponent) {
//        this.productComponent = productComponent;
//    }
	List<String> products = new ArrayList<String>();
	public List<String> addProduct(String prd){
		products.add(prd);
		return products;
	}
}
