package com.dev.IBIOFront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/admin")
	public String admin() {
		
		return "admin/index";
	}
	
	@RequestMapping("/productManager")
	public String productManager() {
		
		return "admin/productManager";
	}
	
	@RequestMapping("/productDetail")
	public String productDetail() {
		
		return "admin/productDetail";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		
		return "admin/addProduct";
	}
	
	@RequestMapping("/client")
	public String client() {
		
		return "admin/client";
	}
	
	@RequestMapping("/dealer")
	public String dealer() {
		
		return "admin/dealer";
	}
	
	@RequestMapping("/dealerDetail")
	public String dealerDetail() {
		
		return "admin/dealerDetail";
	}
	
	@RequestMapping("/invoiceDetail")
	public String invoiceDetail() {
		
		return "admin/invoiceDetail";
	}
	
	@RequestMapping("/invoiceList")
	public String invoiceList() {
		
		return "admin/invoiceList";
	}
	
	@RequestMapping("/order")
	public String order() {
		
		return "admin/order";
	}
	
	@RequestMapping("/orderDetail")
	public String orderDetail() {
		
		return "admin/orderDetail";
	}
	
	
}
