package Ejemplo;

//Nombre
public class Personas {

    
    //Crer una auto con los siguiente atributos
    //Marca como String
    //Modelo como String 
    //año como int
    //Crear los get y ser 
    //Crear el constructor
    
    
    
    //Atributos o variables de instancia
    private String cedula;
    private String nombre;
    private String Apellidos;
    private String genero;
    private int numeroCuenta;
    private String tipoMoneda;
    private double saldo;
    
    //Constructor
    //Inicializa la clase 
    public Personas(String cedula,String nombre, String Apellidos, String genero, int numeroCuenta, String tipoMoneda, double saldo){ 
        setCedula(cedula);
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.genero = genero;
        this.numeroCuenta = numeroCuenta;
        this.tipoMoneda = tipoMoneda;
        this.saldo = saldo;
        
    }

    //metodos 1-1111-1111
    //Encapsulamiento(public,private, proteted, default) tipo de metodo(String,int,double,void) nombre del metodo(parametro)
    public void setCedula(String cedula) {
        if (cedula.length() == 9 && cedula.matches("\\d+")) {
            this.cedula = cedula;
        } else {
            System.out.println("Formato incorrecto");
        }
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro hecho!");
            System.out.println("El saldo actual es: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void depositar(double deposito){
        if (deposito > 0) {
            saldo = saldo + deposito;
            System.out.println("Deposito realizado, saldo actual: " + saldo);
            
        }else{
            System.out.println("Error, numeros negativos");
        }
    }
    
    public void mostarDatos(){
        System.out.println("------Informacion-------");
        System.out.println("Cedula: "+ this.cedula);
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellidos: "+ this.Apellidos);
        System.out.println("Genero: "+ this.genero);
        System.out.println("Numero de cuenta: "+ this.numeroCuenta);
        System.out.println("Tipo de moneda: "+ this.tipoMoneda);
        System.out.println("saldo: "+ this.saldo);
    }
    
    
    

}
