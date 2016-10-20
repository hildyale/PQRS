package co.edu.udea.iw.dao;

import co.edu.udea.iw.Exeption.MyDaoException;
import co.edu.udea.iw.dto.Employee;

/**
 * 
 * @author Santiago
 *
 */

public interface EmployeeDao {
	
	/**
	 * metodo para obtener un empleado a traves de su email
	 * @param emal
	 * @return
	 * @throws MyDaoException
	 */
	public Employee getEmployeeByEmal(String email) throws MyDaoException;
	
	/**
	 * metodo para obtener un empleado a traves de su id(cedula)
	 * @param id
	 * @return
	 * @throws MyDaoException
	 */
	public Employee getEmployeeById(String id) throws MyDaoException;
	
	/**
	 * metodo para agregar un nuevo empleado a la base de datos
	 * @param employee
	 * @throws MyDaoException
	 */
	public void saveEmployee(Employee employee) throws MyDaoException;

	/**
	 * metodo para realizar modificaciones a un empleado almacenado
	 * @param employee
	 * @throws MyDaoException
	 */
	public void updateEmployee(Employee employee) throws MyDaoException;
	
	/**
	 * metodo para eliminar un empleado de la base de datos
	 * @param employee
	 * @throws MyDaoException
	 */
	public void deleteEmployee(String id) throws MyDaoException; 
	
}
