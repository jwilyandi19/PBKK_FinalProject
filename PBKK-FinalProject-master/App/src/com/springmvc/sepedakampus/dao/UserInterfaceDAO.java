package com.springmvc.sepedakampus.dao;

import java.util.List;

import com.springmvc.sepedakampus.model.User;

public interface UserInterfaceDAO {
	public List<User> getUsers();

	public void addUser(User user);

	public User getUser(User user);

	public void updateUser(User user);

	public User getUserById(int theId);
}
