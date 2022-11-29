package ejercicio_5;
import java.util.Scanner;

public class ServiciosCuenta {
    Scanner read = new Scanner (System.in);
    
// c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    
    public void crearCuenta (CuentaBancaria cuentaBancaria){
        System.out.println("Bienvenido a su cuenta bancaria.");

        System.out.print("Ingrese su numero de cuenta: ");
        cuentaBancaria.setNumeroDeCuenta(read.nextInt());

        System.out.print("Ingrese su DNI: ");
        cuentaBancaria.setDNI(read.nextLong());
        
        cuentaBancaria.setSaldoActual((int) (Math.random() * 1000000+1));
        System.out.println("Su saldo es de: $" + cuentaBancaria.getSaldoActual());
        //System.out.print("Ingrese su saldo: ");
        
    }
    
    
    // d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    
    public void ingresarDinero (CuentaBancaria cuentaBancaria){
        double ingreso;
        
        System.out.print("Digite el monto a ingresar a su cuenta: ");
        
        ingreso= read.nextDouble();
        
        cuentaBancaria.setSaldoActual((cuentaBancaria.getSaldoActual()+ ingreso));
        
        System.out.println("Usted deposito $"+ ingreso +" a su cuenta.\nSu saldo actual es de: $" + cuentaBancaria.getSaldoActual());
        
    }
      //e Método retirar
     public void retirarDinero (CuentaBancaria cuentaBancaria){
        double retiro;
        
        System.out.print("Digite el monto a retirar de su cuenta: ");
        retiro= read.nextDouble();
        
        cuentaBancaria.setSaldoActual((cuentaBancaria.getSaldoActual() - retiro));
        System.out.println("Usted retiro $" + retiro +" de su cuenta.\nSu saldo actual es de: $" + cuentaBancaria.getSaldoActual());
        
    }
    
     // f)  Método extraccion rapida
     public void extraccionRapida (CuentaBancaria cuentaBancaria){
        double retiro;
        double permitido;
        
        permitido = cuentaBancaria.getSaldoActual()*0.2;
        
        System.out.println("Extraccion rápida");
        System.out.print("Digite el monto a retirar de su cuenta: ");
        retiro= read.nextDouble();
        
        while(retiro>permitido){
            System.out.print("Error. Usted puede retirar hasta $" + permitido+ "\nDigite nuevamente el monto a retirar de su cuenta: " );
             retiro= read.nextDouble();
        
        }
           
        cuentaBancaria.setSaldoActual((cuentaBancaria.getSaldoActual() - retiro));
        System.out.println("Usted retiro $" + retiro +" de su cuenta.\nSu saldo actual es de: $" + cuentaBancaria.getSaldoActual());
        
    }
    
    // g) Método consultarSaldo()
     public void consultarSaldo (CuentaBancaria cuentaBancaria){
         System.out.println("Su saldo actual es:$ "+cuentaBancaria.getSaldoActual());
     }
     
     // h) consultarDatos()
     public void consultarDatos (CuentaBancaria cuentaBancaria){
         System.out.println(cuentaBancaria);
     }
}
