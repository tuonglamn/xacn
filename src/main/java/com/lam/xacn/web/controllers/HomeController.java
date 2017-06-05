/**
 * 
 */
package com.lam.xacn.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * @author LamNguyen
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@Autowired
	public Environment env;
	
	@RequestMapping("/")
    public String index(Model model) {
		model.addAttribute("page", "index");
        return "index";
        
    }
}
