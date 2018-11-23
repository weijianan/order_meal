package com.wjn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjn.entity.User;
import com.wjn.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/LoginAction")
	public String loginAction(HttpSession session,User user,String validateCode,Model model) {
		String code = (String) session.getAttribute("Code");
		if(!code.equals(validateCode)) {
			session.setAttribute("msg", "请输入正确的验证码！");
			return "redirect:login.jsp";
		}
		User login_user = userService.login(user);
		if (login_user==null) {
			session.setAttribute("msg2", "用户名或密码不正确！");
			return "redirect:login.jsp";
		}
		session.setAttribute("login_user", login_user);
		return "redirect:index.jsp";
	}
	
	
	@RequestMapping("/LogoutAction")
	public String logoutAction(HttpSession session) {
		session.removeAttribute("login_user");
		return "redirect:login.jsp";
	}
}
