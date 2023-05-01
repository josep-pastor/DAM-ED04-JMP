package cuentas;

/**
 * Esta clase nos permite generar unas cuentas y trabajar sobre estas
 * implementando getters y setters.
 * 
 * 
 * @author Josep Meziane Pastor
 * @version 1.0
 * @since 1.0
 */

public class CCuenta {



	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío.
     */

    
    public CCuenta()
    {
    }

	/**
	 * Constructor que inicializa los parámetros de clase de las cuentas generadas 
	 * @param nom Nombre del titular de la cuenta.
	 * @param cue Código de la cuenta.
	 * @param sal Balance existente en la cuenta.
	 * @param tipo Tipo de interés aplicado a la cuenta.
	 */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * 
     * Este método devuelve el balance de la cuenta.
     * @return Devuelve el saldo.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * 
     * Este método permite ingresar dinero en la cuenta.
     * 
     * @param cantidad Dinero que se quiere ingresar en la cuenta.
     * @throws Exception Si este dinero es negativo, se devuelve un error.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * Este método permite retirar dinero de la cuenta.
     * @param cantidad Dinero que se quiere retirar de la cuenta.
     * @throws Exception Si este dinero es negativo se devuelve un error.
     * @throws Exception Si no se dispone del dinero suficiente se devuelve un error.
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * 
     * Este método devuelve el nombre del propietario de la cuenta.
     */
    
	private String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * Este método permite modificar el nombre del propietario de la cuenta.
	 */
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * Este método devuelve el número de la cuenta.
	 */
	
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * 
	 * Este método permite modificar el número de la cuenta.
	 */
	
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
    /**
     * 
     * Este método devuelve el balance actual de la cuenta.
     */
	
	private double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * Este método permite modificar el balance de la cuenta.
	 */
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
    /**
     * 
     * Este método devuelve el tipo de interés asignado a la cuenta.
     */
	
	private double getTipoInteres() {
		return tipoInteres;
	}

    /**
     * 
     * Este método permite modificar el tipo de interés asignado a la cuenta.
     */
	
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
