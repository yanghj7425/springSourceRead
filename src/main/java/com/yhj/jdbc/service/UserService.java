package com.yhj.jdbc.service;

import com.yhj.jdbc.entity.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
	List<User> queryAllUser();

	void save(User user);
}

