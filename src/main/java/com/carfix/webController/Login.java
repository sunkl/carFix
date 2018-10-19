package com.carfix.webController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.carfix.entity.User;
import com.carfix.service.inter.UserInter;

@Controller
@RequestMapping("sys")
public class Login {
	@Autowired
	UserInter userInter;
	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping("login")
	@ResponseBody
	public ModelAndView getLogin() {
		User user = userInter.findById(1L);
		modelAndView.addObject("user",user);
		modelAndView.setViewName("login/login");
		return modelAndView;
	}
	@RequestMapping("getAllUsers")
	@ResponseBody
	public ModelAndView getAllUsers() {
		List<User> users = userInter.findAll();
		modelAndView.addObject("users",users);
		modelAndView.setViewName("test");
		return modelAndView;
	}
}
