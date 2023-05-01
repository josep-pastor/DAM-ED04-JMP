package cuentas;

/**
 * Esta clase es la clase principal, genera las cuentas mediante el constructor implementado en CCuenta.
 * Podemos operar sobre estas cuentas empleando los métodos implementados en CCuenta
 * 
 * 
 * @author Josep Meziane Pastor
 * @version 1.0
 * @since 1.0
 */

public class Main {
	
	/**
	 * Método main desde donde se ejecuta un método para operar en la cuenta.
	 * Aquí se genera una nueva cuenta.
	 * @param args 
	 */
	
	
    public static void main(String[] args) {
        CCuenta cuenta1;   //En este caso empleamos el constructor vacío.
        double saldoActual;
        float cantidad = 0f;
        operativa_cuenta(cantidad);
    }
    
    /**
     * Método que asigna valores a la cuenta generada y nos permite modificarlos.
     * @param saldoActual Se almacena el valor del balance de la cuenta.
     * @param cantidad Se almacena el valor que se va a modificar al balance, sea añadiendo o sustrayendo.
     */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
