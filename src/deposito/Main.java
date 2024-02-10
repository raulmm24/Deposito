package deposito;

/**
 *
 * @author raulm
 */

/**
 * Clase principal que contiene el metodo Main y un metodo para realizar las operaciones con una cuenta bancaria.
 */

public class Main {

    /**
     * Metodo principal que se ejecuta al iniciar la aplicacion.
     * 
     * @param args  Argumentos de linea de comandos (no se utilizan en este caso). 
     */
    
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        //Crear una instancia de Ccuenta con valores iniciales.
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300); //Intentar retirar una cantidad de la cuenta.
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);  //Intentar ingresar una cantidad en la cuenta.
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
    /**
     * Metodo para realizar operaciones en la cuenta bancaria, como retirar e ingresar dinero.
     * 
     * @param cuenta    La cuenta bancaria sobre la que se realizaran las operaciones.  
     * @param cantidad  La cantidad de dinero que se retirara e ingresara en la cuenta.
     */
    
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;

        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta.retirar(2300); //Intenta retirar una cantidad de la cuenta.
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695); //Intenta ingresar una cantidad en la cuenta.
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
