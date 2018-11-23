package com.wjn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.wjn.dao.MenuMapper;
import com.wjn.entity.Menu;
import com.wjn.entity.MenuExample;
import com.wjn.entity.UserExample;
import com.wjn.entity.MenuExample.Criteria;
import com.wjn.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuMapper mapper;
	private MenuExample example;
	private Criteria criteria;
	private int pageSize = 8;

	public List<Menu> findAll() {
		List<Menu> list = null;
		init();

		criteria.andIdIsNotNull();
		list = mapper.selectByExample(example);

		endOp();
		return list;
	}

	public List<Menu> findByPages(int pageNum) {
		List<Menu> list = null;
		init();

		criteria.andIdIsNotNull();
		PageHelper.startPage(pageNum, pageSize);
		list = mapper.selectByExample(example);
		
		endOp();
		return list;
	}

	public long getPageCount() {
		long pageCount = 0;
		init();

		criteria.andIdIsNotNull();
		long menuCount = mapper.countByExample(example);
		pageCount = (menuCount + pageSize - 1) / pageSize;

		endOp();
		return pageCount;
	}

	private void init() {
		example = new MenuExample();
		criteria = example.createCriteria();
	}

	private void endOp() {
		example = null;
		criteria = null;
	}

}
