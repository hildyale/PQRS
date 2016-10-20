package co.edu.udea.iw.Exeption;

import org.apache.log4j.Logger;

public class MyDaoExeception extends Exception {

	Logger  log = Logger.getLogger(this.getClass());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyDaoExeception(String message, Throwable cause) {
		super(message, cause);
		log.error(message);
		// TODO Auto-generated constructor stub
	}

	public MyDaoExeception(Throwable cause) {
		super(cause);
		log.error(cause.getMessage());
		// TODO Auto-generated constructor stub
	}

	
	

	
	
	
	

}
