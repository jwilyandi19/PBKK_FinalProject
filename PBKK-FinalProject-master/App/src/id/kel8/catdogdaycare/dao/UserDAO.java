package id.kel8.catdogdaycare.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import id.kel8.catdogdaycare.model.User;

@Repository
public class UserDAO implements UserInterfaceDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<User> query = currentSession.createQuery("from User", User.class);
		
		List<User> users = query.getResultList();
		return users;
	}

	@Override
	public void addUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(user);
	}

	@Override
	public User getUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		User hasil = null;
        String que = "from User where userEmail=:user_email and userPassword=:user_password";
        Query<User> query = currentSession.createQuery(que);
        query.setParameter("user_email", user.getUserEmail());
		query.setParameter("user_password", user.getUserPassword());
		try {
			hasil = query.getSingleResult();
		} catch (NoResultException e) {
			// pass
		}
		return hasil;
	}

	@Override
	public void updateUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(user);
	}

	@Override
	public User getUserById(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		User hasil = currentSession.get(User.class, theId);
		return hasil;
	}

}
