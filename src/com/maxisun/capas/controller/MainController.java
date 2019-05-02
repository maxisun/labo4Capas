package com.maxisun.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.maxisun.capas.domain.Product;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		mav.addObject("greet", "Ingrese un producto");
		mav.addObject("product", product);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/ProductAdd")
	public ModelAndView form(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.addObject("greet", "Ingrese un producto");
			mav.setViewName("main");
			//System.out.println(product.getFechaVencimiento());
		}else {
			mav.addObject("message", "Producto ingresado exitosamente");
			mav.setViewName("success");
			//System.out.println(product.getFechaVencimiento());
		}
		return mav;
	}
}
