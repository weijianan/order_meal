package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.wjn.dao.MenuMapper;
import com.wjn.dao.UserMapper;
import com.wjn.entity.Menu;
import com.wjn.entity.MenuExample;
import com.wjn.entity.User;
import com.wjn.entity.UserExample;
import com.wjn.service.MenuService;
import com.wjn.service.UserService;

public class MyTest {

	@Test
	public void test1() {
		UserMapper dao = new ClassPathXmlApplicationContext("classpath:config/spring-mybatis.xml")
				.getBean(UserMapper.class);
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		PageHelper.startPage(1, 2);
		List<User> list = dao.selectByExample(example);
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void test2() {
		MenuMapper dao = new ClassPathXmlApplicationContext("classpath:config/spring-mybatis.xml")
				.getBean(MenuMapper.class);
		MenuExample example = new MenuExample();
		MenuExample.Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		// PageHelper.startPage(1, 2);
		List<Menu> list = dao.selectByExample(example);
		for (Menu menu : list) {
			System.out.println(menu.getName());
		}
	}

	@Test
	public void test3() {
		UserService service = new ClassPathXmlApplicationContext("classpath:config/spring-mybatis.xml")
				.getBean(UserService.class);
		User u = new User();
		u.setUsername("admin");
		u.setPassword("admin");
		User login = service.login(u);
		System.out.println(login);
	}

	@Test
	public void test4() {
		MenuService service = new ClassPathXmlApplicationContext("classpath:config/spring-mybatis.xml")
				.getBean(MenuService.class);
		List<Menu> findAll = service.findByPages(2);
		for (Menu menu : findAll) {

			System.out.println(menu);
		}
	}
}
