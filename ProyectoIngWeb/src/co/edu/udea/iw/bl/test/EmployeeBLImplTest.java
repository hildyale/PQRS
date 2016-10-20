package co.edu.udea.iw.bl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.udea.iw.Exeption.MyDaoException;
import co.edu.udea.iw.bl.EmployeeBL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:configuracionSpring.xml"})

public class EmployeeBLImplTest {
	
	@Autowired
	EmployeeBL employeeBL;

	@Test
	public void testCrearempleado() {
		try{
			String a = "alejo4";
			Double b = 0.0;
			employeeBL.crearEmpleado(a,a,a,b,a,a);
			
		}catch(MyDaoException | NullPointerException e){
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void validar() {
		try{
			String a = "alejo4";
			employeeBL.validarEmpleado(a,a);
			
		}catch(MyDaoException | NullPointerException e){
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void eliminar() {
		try{
			String a = "alejo4";
			employeeBL.eliminarEmpleado(a);
			
		}catch(MyDaoException | NullPointerException e){
			fail(e.getMessage());
		}
		
	}

}
