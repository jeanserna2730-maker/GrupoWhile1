/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupowhile1;
import java.util.Scanner;
public class GrupoWhile1 {
    static double saldo = 1000; // variable compartida entre metodos

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cajero_automatico();
    }
    
    public static void cajero_automatico() {
        Scanner sc = new Scanner(System.in);
        
        int clave = 1234;
        int intentos = 3;
        int opccion;
        int intentos_opccion = 3;
        System.out.println("""
                    -----------------------------------------------------
                                     CAJERO AUTOMATICO
                            Ingrese su tarjeta
                            Tarjeta detectada
                            Ingresa tu clave:
                           """);
        
        while (intentos > 0 && intentos <=3) {
            int clave_ingresada = sc.nextInt();
            if (clave_ingresada == clave) {
                do {
                    System.out.println("""
                                       -----------------------------------------------------
                                                      BIENVENIDO AL CAJERO
                                       -----------------------------------------------------
                                       1. Consultar saldo
                                       2. Retirar dinero
                                       3. Depositar dinero
                                       4. Salir
                                       Ingrese la opcion deseada:
                                       """);
                    opccion = sc.nextInt();
                    switch (opccion) {
                        case 1:
                            System.out.println("Consultar saldo:");
                            consultar_saldo();
                            break;
                        case 2:
                            System.out.println("Retirar dinero:");
                            retirar_dinero();
                            break;
                        case 3:
                            System.out.println("Depositar dinero:");
                            break;
                        case 4:
                            System.out.println("Gracias por elegirnos!!!");
                            break;
                        default:
                            intentos_opccion --;
                            System.out.println("Te quedan "+intentos_opccion+" intentos!");
                            System.out.println("INGRESE UNA OPCIÓN VALIDA!!!");
                    }
                } while (opccion != 4 && intentos_opccion >0); 
                break;
                
            } else {
                intentos = intentos -1;
                System.out.println("Clave incorrecta. Te quedan " + intentos + " intentos");
            }
        }
        if (intentos == 0) {
            System.out.println("Haz superado los 3 intentos...");
        }
    }
    public static void consultar_saldo(){
         System.out.println("Saldo disponible: "+saldo);
         System.out.println("prueba");
    }
    public static void retirar_dinero(){ 
    Scanner sc = new Scanner(System.in);
    int intentos_retiro = 3;
    double retirar;
    double saldo_cuenta;
    while(intentos_retiro>0){
        System.out.println("============");
        System.out.println("ingrese la cantidad de dinero a retirar");
        retirar=sc.nextDouble();
        if(retirar<0){
        System.out.println("no se aceptan numeros negativos");
        }else{
            if (saldo>=retirar){
                System.out.println("Cantidad correcta");
                System.out.println("se restara de su cuenta");
                saldo_cuenta =saldo - retirar;
                System.out.println("se retiro con exito");
                System.out.println("su cuenta quedo con "+saldo_cuenta +" dolares");
                System.out.println("============================");
                break;
            }else{
                System.out.println("cantidad incorrecta");
                System.out.println("no tiene el dinero suficiente");
            }
        }
        intentos_retiro--;
        System.out.println("INTENTOS RESTANTES "+intentos_retiro);
        if(intentos_retiro==0){
            System.out.println("SE AGOTARON SUS INTENTOS");
        }
    }
    }
    public static void depositar_dinero(){
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese el monto a depositar");
         double monto = sc.nextDouble();
         
         if (monto <= 0){
             System.out.println("el monto debe ser mayor a 0");
         }else{
             saldo += monto;
            
             
         }
         
    }
}
