/**
 * 
 */
package com.brsc.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
/**
 * @author YuTian
 *
 */
@Controller
@Scope("prototype")
@ParentPackage("ssh")
@Results({
	@Result(name="success",location	= "/hello.jsp")
})
public class DocumentAction {
	
	@Action("/hello")
	public String hello(){
		System.out.println("I worked");
		return "success";
	}

}
