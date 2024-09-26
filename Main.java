import java.util.ArrayList;
public class Main {
public static void main (String [] args){



    Cuenta cuenta1 = new Cuenta("Corriente", "1234-5", 100000);
    Cuenta cuenta2 = null;
    Cuenta cuenta3 = cuenta1;

    ArrayList<Cuenta> cuentas = new ArrayList<>();
    cuentas.add(cuenta1);
    cuentas.add(cuenta2);
    cuentas.add(cuenta3);

    System.out.println(cuentas);

    for(int i = 0; i < cuentas.size(); i++){ //inicializa, condición//para que se siga ejecutando 
        System.out.println("Numero de cuenta: %s, tipo de cuenta: %s), Saldo: %f", cuentas.get(i).getNumero(), cuentas.get(i).getTipo(),cuentas.get(i).getSaldo());
     
         }


}
    
}