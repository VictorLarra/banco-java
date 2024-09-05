public class Main {

public static void main (String[] args ){
    int valor = 100000; 
    Cuenta cuenta = new Cuenta (); // Creamos el objeto de la clase cuenta 
    System.out.println(cuenta.consultarSaldo());

    cuenta.consignar(valor);
    System.out.println(cuenta.consultarSaldo());
    
   boolean pudoRetirar = cuenta.retirar(50000.5);
   System.out.println("Pudo retirar " + pudoRetirar);
   System.out.println(cuenta.consultarSaldo());

   boolean pudoSegundoRetiro = cuenta.retirar(50000.5);
   System.out.println("Pudo retirar " + pudoRetirar);
}


}