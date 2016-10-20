package co.edu.udea.iw.bl.Impl;

import java.util.Date;

import co.edu.udea.iw.bl.EmployeeBL;
import co.edu.udea.iw.Exeption.MyDaoException;
import co.edu.udea.iw.dao.EmployeeDao;
import co.edu.udea.iw.dto.Employee;
/**
 * clase que implementa la interaz del empleado
 * @author alejo
 *
 */
public class EmployeeBLImpl implements EmployeeBL {
	
	EmployeeDao EmployeeDao;
	
	public EmployeeBLImpl(EmployeeDao EmployeeDao){
		this.EmployeeDao = EmployeeDao;
	}

	@Override
	public void validarEmpleado(String email, String password)
			throws MyDaoException {
		
		if (email == null || "".equals(email.trim())) {
			throw new NullPointerException("Debe especificar el email del empleado.");
        }
		if (password == null || "".equals(password.trim())) {
			throw new NullPointerException("Debe especificar la contrasena del empleado.");
        }

		Employee empleado = EmployeeDao.getEmployeeByEmal(email);
		
		if (empleado  == null){
			throw new MyDaoException("El usuario crea no existe");
		}
		
		String pass = empleado.getPassword();
		
		if (!(pass.equals(password))){
			throw new MyDaoException("La contrasena es incorrecta");
		}

	}

	@Override
	public void crearEmpleado(String cedula,String name, String lastname, Double salary,
			String email, String password)
			throws MyDaoException {
		

		if (cedula == null || "".equals(cedula.trim())) {
			throw new NullPointerException("Debe especificar la cedula del empleado.");
        }
		if (name == null || "".equals(name.trim())) {
			throw new NullPointerException("Debe especificar el nombre del empleado.");
        }
		if (lastname == null || "".equals(lastname.trim())) {
			throw new NullPointerException("Debe especificar el apellido del empleado.");
        }
		if (salary == null ) {
			throw new NullPointerException("Debe especificar el salario del empleado.");
        }
		if (email == null || "".equals(email.trim())) {
			throw new NullPointerException("Debe especificar el email del empleado.");
        }
		if (password == null || "".equals(password.trim())) {
			throw new NullPointerException("Debe especificar la contrasena del empleado.");
        }
		

	    Employee empleado = new Employee();
	    empleado.setId(cedula);
	    empleado.setName(name);
	    empleado.setLast_name(lastname);
	    empleado.setEmail(email);
	    empleado.setPassword(password);
	    empleado.setStart_date(new Date());
	    empleado.setSalary(salary);
	    
	    EmployeeDao.saveEmployee(empleado);

	}

	@Override
	public void eliminarEmpleado(String email) throws MyDaoException {
		if (email == null || "".equals(email.trim())) {
			throw new NullPointerException("Debe especificar el email del empleado.");
        }
		
		Employee empleado = EmployeeDao.getEmployeeByEmal(email);
		String id = empleado.getId();
		EmployeeDao.deleteEmployee(id);
		
	}
	
	@Override
	public void actualizarEmpleado(String cedula,String name, String lastname, Double salary,
			String email, String password)
			throws MyDaoException {
		

		if (cedula == null || "".equals(cedula.trim())) {
			throw new NullPointerException("Debe especificar la cedula del empleado.");
        }
		
		Employee empleado = EmployeeDao.getEmployeeByEmal(email);
		
		if (!(name == null || "".equals(name.trim()))) {
			empleado.setName(name);
        }
		if (!(lastname == null || "".equals(lastname.trim()))) {
			empleado.setLast_name(lastname);
        }
		if (!(salary == null )) {
			empleado.setSalary(salary);
        }
		if (!(email == null || "".equals(email.trim()))) {
			empleado.setEmail(email);
        }
		if (!(password == null || "".equals(password.trim()))) {
			empleado.setPassword(password);
        }
	    
	    
	    EmployeeDao.updateEmployee(empleado);

	}

}
