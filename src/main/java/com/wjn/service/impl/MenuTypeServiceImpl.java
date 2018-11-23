package com.wjn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjn.dao.MenuTypeMapper;
import com.wjn.entity.MenuType;
import com.wjn.entity.MenuTypeExample;
import com.wjn.entity.MenuTypeExample.Criteria;
import com.wjn.service.MenuTypeService;

@Service
public class MenuTypeServiceImpl implements MenuTypeService {
	@Autowired
	private MenuTypeMapper menuTypeMapper;
	
	public List<MenuType> findAll() {
		MenuTypeExample example = new MenuTypeExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		List<MenuType> list = menuTypeMapper.selectByExample(example);
		return list;
	}

}
