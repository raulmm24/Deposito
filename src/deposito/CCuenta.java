package deposito;

/**
 *
 * @author raulm
 */

public class CCuenta {


    private String nombre;      //Nombre del titular de la cuenta
    private String cuenta;      //Numero de cuenta
    private double saldo;       //Saldo actual de la cuenta
    private double tipoInteres; //Tipo de interes asociado a la cuenta

    /**
     * Constructor por defecto de la clase Ccuenta.
     */
    
    public CCuenta(){
    }

    /**
     * 
     * @param nom   Nombre del titular de la cuenta
     * @param cue   Numero de cuenta
     * @param sal   Saldo actual de la cuenta
     * @param tipo  Tipo de interes asociado a la cuenta
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres= tipo;
    }

    /**
     * Metodo para obtener el estado actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    
    public double estado()
    {
        return saldo;
    }

    /**
     * Metodo para ingresar una cantidad en la cuenta.
     * 
     * @param cantidad    Cantidad a ingresar en la cuenta.
     * @throws Exception  Si la cantidad es negativa.
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo para retirar una cantidad de la cuenta.
     * 
     * @param cantidad      Cantidad a retirar de la cuenta.
     * @throws Exception    Si la cantidad es negativa o si no hay suficiente.
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
 // Getters y Setters para los atributos encapsulados.
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getCuenta(){
        return cuenta;
    }
    
    public void setCuenta(String cuenta){
        this.cuenta= cuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo= saldo;
    }
    
    public double getTipoInteres (){
        return tipoInteres;
    }
    
     public void setTipoInteres(double tipoInteres){
        this.tipoInteres= tipoInteres;
    }
}
