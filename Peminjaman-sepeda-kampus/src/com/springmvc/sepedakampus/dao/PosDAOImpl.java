package com.springmvc.sepedakampus.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springmvc.sepedakampus.entity.Pos;

@Repository
public class PosDAOImpl implements PosDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Pos> getPoss() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query
		Query<Pos> theQuery = 
				currentSession.createQuery("from Pos", Pos.class);
		List<Pos> poss = theQuery.getResultList();
		return poss;
				
	}
}
