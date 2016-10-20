package co.edu.udea.iw.dao;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.Exeption.MyDaoException;
import co.edu.udea.iw.dto.Employee;
import co.edu.udea.iw.dto.User;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public User getuserByEmal(String email) throws MyDaoException {
		Session session = null;
		User user= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Employee.class).add(Restrictions.eq("email", email));
			user = (User) crit.uniqueResult(); 
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}
		return user;

	}
	
	@Override
	public User getuserById(String id) throws MyDaoException {
		Session session = null;
		User user= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Employee.class).add(Restrictions.eq("id", id));
			user = (User) crit.uniqueResult(); 
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}
		return user;

	}

	@Override
	public void saveUser(User user) throws MyDaoException {
		Session session = null;
		// necesario para poder hacer commit a las transacciones
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			session.save(user);
			// para poder guardar la transation
			transaction.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}
		
	}

	@Override
	public void updateUser(User user) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction= session.beginTransaction();
			session.update(user);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}		
	}

	@Override
	public void deleteUser(String id) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		User user = new User();
		user.setId(id);
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.delete(user);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}
	

}
