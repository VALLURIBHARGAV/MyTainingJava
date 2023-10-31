package com.model;


import java.util.HashMap;

public class Cart {
	HashMap<Integer,Item> items = new HashMap<Integer,Item>();
	public void addItem(Item obj) {
		items.put(obj.getProductId(), obj);
		
	}
	public void emptyCart() {
		items.clear();
	}

	public void removeItem(int productId) {
		// TODO Auto-generated method stub
		items.remove(productId);
	}
}
