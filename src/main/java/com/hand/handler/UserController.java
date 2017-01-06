package com.hand.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.dto.Customer;
import com.hand.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/loginin", method = RequestMethod.GET)
	@ResponseBody
	public Map getUser(@RequestParam(name = "first_name", required = false, defaultValue = "") String first_name) {
		Map<String,String> map=new HashMap<String,String>();
		Customer user= userService.getUserByName(first_name);
		if(user.getFirst_name()==null){
			map.put("url","/Exam-12698-20170106-1/login.html");
			//return "/Exam-12698-20170106-1/login.html";
		}else{
			map.put("url","/Exam-12698-20170106-1/index.html");
		//return "/Exam-12698-20170106-1/index.html";
	   }
		return map;
    }
	
}
