package com.jd.feima.controller;

import com.jd.feima.domain.Menu;
import com.jd.feima.domain.Role;
import com.jd.feima.domain.UserInfo;
import com.jd.feima.service.MenuService;
import com.jd.feima.service.RoleService;
import com.jd.feima.service.UserService;
import com.jd.feima.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.SecurityUtils;

import java.util.List;
import java.util.ResourceBundle;

@Controller
@RequestMapping("/user")
public class UserController {



	@Autowired
	private UserService userService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		UserInfo userInfo = userService.getUserById(userId);
/*
		//获取userid 的权限，获取用户的菜单 和 角色,当前用户是谁，允许做什么 subject
		Subject currentUser = SecurityUtils.getSubject();*/

		//页面存在四个菜单 merchant product auditing collect
		List<Menu> menus = menuService.getAll();
		//系统存在四个角色 超管 0 采销 1 采销经理 2 质控经理 3
		List<Role> roles = roleService.getAll();
		modelMap.put("menus",menus);
		modelMap.put("roles",roles);
		modelMap.addAttribute("userInfo", userInfo);
		System.out.println(Messages.getString("ValidationError.0"));
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		List<UserInfo> userInfos = userService.getUsers();
		return userInfos;
	}
}