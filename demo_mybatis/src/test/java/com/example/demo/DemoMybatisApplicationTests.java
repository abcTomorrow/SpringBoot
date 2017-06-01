package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMybatisApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		// User user = new User();
		// user.setName("zhang");
		// user.setAge(23);
		// userMapper.insert(user);
		List<User> list = userMapper.findAll();
		for (User user : list) {
			System.out.println(user.toString());
		}
	}

}
