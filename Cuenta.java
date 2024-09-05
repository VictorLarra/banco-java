    package Cuenta;


    public class Cuenta {
        String numeroCuenta;
        String tipoCuenta;
        double saldoCuenta; 
        
    
    public Cuenta(String numeroCuenta, String tipoCuenta, double saldoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;

    }  

public class Main {
public static void main (String[] args ){
    Cuenta pepePerez = new Cuenta("Sesenta y seis", "Cuenta de Ahorros" , 250000);
    Cuenta lolaPerez = new Cuenta("Noventa y tres", "Cuenta Corriente", 800000);
}
}



    public double consultarSaldo(){

        System.out.println("Su saldo es "+ saldoCuenta);
    }

    public static void 
}

    