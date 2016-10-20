package co.edu.udea.iw.dao;

import co.edu.udea.iw.Exeption.MyDaoException;
import co.edu.udea.iw.dto.User;


/**
 * 
 * @author Santiago
 *
 */
public interface UserDao {
	
	/**
	 * metodo para obtener un usuario a traves de su email
	 * @param id
	 * @return
	 * @throws MyDaoException
	 */
	public User getuserByEmal(String email) throws MyDaoException;
	
	/**
	 * metodo para obtener un usuario a traves de su id(cedula)
	 * @param id
	 * @return
	 * @throws MyDaoException
	 */
	public User getuserById(String id) throws MyDaoException;
	
	/**
	 * metodo para agregar un nuevo usuario a la base de datos
	 * @param user
	 * @throws MyDaoException
	 */
	public void saveUser(User user) throws MyDaoException;

	/**
	 * metodo para realizar modificaciones a un usuario almacenado
	 * @param user
	 * @throws MyDaoException
	 */
	public void updateUser(User user) throws MyDaoException;
	
	/**
	 * metodo para eliminar un usuario de la base de datos
	 * @param id
	 * @throws MyDaoException
	 */
	public void deleteUser(String id) throws MyDaoException; 
	


}
