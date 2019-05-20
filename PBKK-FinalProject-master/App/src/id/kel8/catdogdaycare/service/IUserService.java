package id.kel8.catdogdaycare.service;

import java.util.List;

import id.kel8.catdogdaycare.model.User;
import id.kel8.catdogdaycare.model.Petugas;

public interface IUserService {
	public List<User> getUsers();

	public void addUser(User user);

	public User getUser(User user);

	public void updateUser(User user);

	public User getUserById(int theId);
}
