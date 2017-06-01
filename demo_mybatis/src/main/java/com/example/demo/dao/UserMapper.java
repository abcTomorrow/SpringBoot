package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.User;

@Component
public interface UserMapper {
	List<User> findAll();

	void insert(User user);

	void update(User user);

	void delete(Long id);
}
