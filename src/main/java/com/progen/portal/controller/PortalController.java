package com.progen.portal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.progen.portal.beans.UserBean;
import com.progen.portal.dao.PortalDao;
import com.progen.portal.pojos.UserPojo;
import com.progen.portal.services.PortalService;

@Controller
public class PortalController {

	@Autowired
	private PortalService portalService;

	@RequestMapping("/")
	public ModelAndView handleRequest(ModelMap map) throws Exception {
//		List<UserBean> listUsers = portalService.getUserLIst();
//		map.addAttribute("userList", listUsers);
		return new ModelAndView("index");
	}
	@RequestMapping("/home")
	public ModelAndView home(ModelMap map) throws Exception {
		System.out.println("Home Comming...");
		return new ModelAndView("index");
	}
	
		
}
