package com.wjn.service;

import java.util.List;

import com.wjn.entity.Menu;

public interface MenuService {
	public List<Menu> findAll();

	public List<Menu> findByPages(int pages);

	public long getPageCount();
}
