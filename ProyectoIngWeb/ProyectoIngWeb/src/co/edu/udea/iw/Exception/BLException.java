package co.edu.udea.iw.Exception;

import org.apache.log4j.Logger;

/**
 * Esta clase representa una excepcion lanzada desde la logica de negocio.
 * @author CristianCamilo
 *
 */
public class BLException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private final Logger LOG = Logger.getLogger(this.getClass());

	/**
	 * Constructor vacio de la clase.
	 */
	public BLException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public BLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		LOG.error(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BLException(String message, Throwable cause) {
		super(message, cause);
		LOG.error(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public BLException(String message) {
		super(message);
		LOG.error(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public BLException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
