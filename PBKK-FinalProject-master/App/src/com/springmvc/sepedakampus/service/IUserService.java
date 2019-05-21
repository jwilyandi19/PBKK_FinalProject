package com.springmvc.sepedakampus.service;

import java.util.List;

import com.springmvc.sepedakampus.model.Petugas;
import com.springmvc.sepedakampus.model.User;

public interface IUserService {
	public List<User> getUsers();

	public void addUser(User user);

	public User getUser(User user);

	public void updateUser(User user);

	public User getUserById(int theId);
}
