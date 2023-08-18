package com.dev.IBIOFront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"/index", "/"})
	public String index() {
		
		return "front/index";
	}
	
	@RequestMapping("/returnProduct")
	public String returnProduct() {
		
		return "front/returnProduct";
	}
	
	@RequestMapping("/dealerRegister")
	public String dealerRegister() {
		
		return "front/dealerRegister";
	}
	
	@RequestMapping("/myAccount")
	public String myAccount() {
		
		return "front/myAccount";
	}
	
	@RequestMapping("/register")
	public String register() {
		
		return "front/register";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "front/login";
	}
	
	@RequestMapping("/myShopping")
	public String myShopping() {
		
		return "front/myShopping";
	}
	
	@RequestMapping("/myPayment")
	public String myPayment() {
		
		return "front/myPayment";
	}
	
	@RequestMapping("/myDelivery")
	public String myDelivery() {
		
		return "front/myDelivery";
	}
	
	@RequestMapping("/searchResult")
	public String searchResult() {
		
		return "front/searchResult";
	}
	
	@RequestMapping("/cart")
	public String cart() {
		
		return "front/cart";
	}
	
	@RequestMapping("/wishList")
	public String wishList() {
		
		return "front/wishList";
	}
	
	@RequestMapping("/payment")
	public String payment() {
		
		return "front/payment";
	}
	
	@RequestMapping("/categoryV1")
	public String categoryV1() {
		
		return "front/categoryV1";
	}
	
	@RequestMapping("/categoryV2")
	public String categoryV2() {
		
		return "front/categoryV2";
	}
	
	@RequestMapping("/categoryV3")
	public String categoryV3() {
		
		return "front/categoryV3";
	}
	
	@RequestMapping("/productV1")
	public String productV1() {
		
		return "front/productV1";
	}
	
	@RequestMapping("/productV2")
	public String productV2() {
		
		return "front/productV2";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		
		return "front/contact";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return "front/about";
	}
	
	@RequestMapping("/sitemap")
	public String sitemap() {
		
		return "front/sitemap";
	}
	
	@RequestMapping("/faq")
	public String faq() {
		
		return "front/faq";
	}
	
	@RequestMapping("/event")
	public String event() {
		
		return "front/event";
	}
	
	@RequestMapping("/dealerShop")
	public String dealerShop() {
		
		return "front/dealerShop";
	}
	
	@RequestMapping("/quickView")
	public String quickView() {
		
		return "front/quickView";
	}
}
