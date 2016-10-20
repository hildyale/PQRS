package co.edu.udea.iw.bl;

import co.edu.udea.iw.Exeption.MyDaoException;


/**
 * 
 * @author alejo
 * Interfaz que contiene todo los metodos usados en la logica para el empleado
 */
public interface EmployeeBL {
	/**
	 * Metodo que valida que un empleado exista en la base de datos
	 * @param email
	 * @param pass
	 * @throws MyDaoException
	 */
	public void validarEmpleado(String email,String password) throws MyDaoException;
	
	/**
	 * Metodo que crea un empleado exista en la base de datos
	 * @throws MyDaoException
	 */
	public void crearEmpleado(String cedula,String name ,String lastname ,Double salary ,String email,String password) throws MyDaoException;
	
	/**
	 * Metodo que crea un empleado exista en la base de datos
	 * @throws MyDaoException
	 */
	public void eliminarEmpleado(String email) throws MyDaoException;
	
	/**
	 * Metodo que actualiza un empleado exista en la base de datos
	 * @throws MyDaoException
	 */
	public void actualizarEmpleado(String cedula,String name ,String lastname ,Double salary ,String email,String password) throws MyDaoException;

}
