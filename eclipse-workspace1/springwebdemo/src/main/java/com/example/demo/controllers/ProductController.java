package com.example.demo.controllers;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	@GetMapping("/display")
	public String displayProduct(Model model) {
//		Product myPrd = new Product(1,"Java",599);
		Product myPrd = service.getProductById(2);
		model.addAttribute("product",myPrd);
		model.addAttribute("user","Bhargav");
		
		return "displayProduct";
	}
	
	@GetMapping("/productList")
	public String displayProductList(Model model) {
//		List<Product> prdList = new ArrayList<Product>();
//		prdList.add(new Product(1,"Java",599));
//		prdList.add(new Product(2,"Python",699));
//		prdList.add(new Product(3,"C Sharp",799));
//		prdList.add(new Product(4,"Spring",899));
//		prdList.add(new Product(5,"Hibernate",699));
//		prdList.add(new Product(6,"Angular",799));
		Iterable<Product> prdList = service.getAllProducts();
		model.addAttribute("productList",prdList);
		return "displayProductList";
	}
	
	@GetMapping("/addProduct")
	public ModelAndView addProduct() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("product", new Product());
		mv.setViewName("addProduct");
		return mv;
	}
	@PostMapping("/addProduct")
	@ResponseBody
	public String saveProduct(Product prd) {
		return service.saveProduct(prd);
	}
	@GetMapping("/user")
	public ModelAndView printUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user","Bhargav");
		mv.setViewName("user");
		return mv;
	}
}
