    
     

    public class Cuenta{
       double saldo;
       String numero;
       String tipo; 
       
       double consultarSaldo(){
       return saldo;
       }
    public Cuenta(){
        this("Ahorros", "",0);
    }
       
       boolean retirar (double cantidad){
            if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
            }
            else {
            return false;
            }
        }
       
       void consignar(double cantidad) {
       saldo += cantidad;
       }


       public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Cuenta(String tipo, String numero, double saldo){//Constructor
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }
     public Cuenta(String tipo, String numero){//Constructor
        this.numero = numero;
        this.tipo = tipo;
    }


    }