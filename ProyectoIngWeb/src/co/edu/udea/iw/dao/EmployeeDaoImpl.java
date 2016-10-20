package co.edu.udea.iw.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.Exeption.MyDaoException;
import co.edu.udea.iw.dto.Employee;

/**
 * 
 * @author Santiago
 * @see co.edu.udea.iw.dao.EmployeeDao 
 */

public class EmployeeDaoImpl implements EmployeeDao {
	
	private SessionFactory sessionFactory;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Employee getEmployeeByEmal(String email) throws MyDaoException {
		Session session = null;
		Employee employee= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Employee.class).add(Restrictions.eq("email", email));
			employee = (Employee) crit.uniqueResult(); 
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}
		return employee;

	}

	@Override
	public Employee getEmployeeById(String id) throws MyDaoException {
		Session session = null;
		Employee employee= null;
		
		try {
			session = sessionFactory.openSession(); 
			Criteria crit = session.createCriteria(Employee.class).add(Restrictions.eq("id", id));
			employee = (Employee) crit.uniqueResult(); 
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}
		return employee;

	}
	
	@Override
	public void saveEmployee(Employee employee) throws MyDaoException {
		Session session = null;
		// necesario para poder hacer commit a las transacciones
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			session.save(employee);
			// para poder guardar la transation
			transaction.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}

	@Override
	public void updateEmployee(Employee employee) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		
		try {
			session = sessionFactory.openSession();
			transaction= session.beginTransaction();
			session.update(employee);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}

	@Override
	public void deleteEmployee(String id) throws MyDaoException {
		Session session = null;
		Transaction transaction=null;
		Employee employee = new Employee();
		employee.setId(id);
		
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.delete(employee);
			transaction.commit();
			
		} catch (HibernateException e) {
			// TODO: handle exception
			throw new MyDaoException(e);
		}

	}

}
