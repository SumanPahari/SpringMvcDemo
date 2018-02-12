package com.suman.web;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlienDao {
	
	@Autowired
	SessionFactory sf;
	
	@Transactional
	public void addAlien(Alien alien) {
		Session session=sf.openSession();
		session.save(alien);
	}

}
