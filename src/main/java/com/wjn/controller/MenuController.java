package com.wjn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjn.entity.Menu;
import com.wjn.service.MenuService;
import com.wjn.service.MenuTypeService;

@Controller
public class MenuController {
	@Autowired
	private MenuService menuService;
	@Autowired
	private MenuTypeService menuTypeService;
	@RequestMapping("/MenuAction")
	public String menuAction(Model model) {
		model.addAttribute("pageCount", menuService.getPageCount());
		model.addAttribute("menulist", menuService.findByPages(1));
		model.addAttribute("pNow", 1);
		model.addAttribute("next", "yes");
		return "menu/menu";
	}

	@RequestMapping("/menu")
	public String menu(String flag, Integer pageNow, Model model) {
		if (flag.equals("menu")) {
			model.addAttribute("pNow", pageNow);
			model.addAttribute("pageCount", menuService.getPageCount());
			List<Menu> menulist = findMenuByPage(pageNow);
			model.addAttribute("menulist", menulist);
			if (pageNow != 1) {
				model.addAttribute("pre", "yes");
			}
			if (pageNow != menuService.getPageCount()) {
				model.addAttribute("next", "yes");
			}
		}else if (flag.equals("menuAdd")) {
			model.addAttribute("menutypelist", menuTypeService.findAll());
			return "menu/menuAdd";
		}
		
		return "menu/menu";
	}

	private List<Menu> findMenuByPage(int pageNow) {
		return menuService.findByPages(pageNow);
	}
}
