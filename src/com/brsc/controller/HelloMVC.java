/**
 * 
 */
package com.brsc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author YuTian
 *
 */
public class HelloMVC implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("I work");
		
		mv.setViewName("index");
		
		return mv;
	}

}
