/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupowhile1;
import java.util.Scanner;
public class GrupoWhile1 {
        static double saldo = 1000; // variable compartida entre metodos
    
public static void main(String[] args){
    cajero_automatico();
}
public static void cajero_automatico() {
        Scanner scc = new Scanner(System.in);  
        
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
            int clave_ingresada = scc.nextInt();
            
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
                    opccion = scc.nextInt();
                    switch (opccion) {
                        case 1:
                            System.out.println("Consultar saldo:");
                            consultar_saldo();
                            break;
                        case 2:
                            System.out.println("Retirar dinero:");
                            if (!retirar_dinero()) {
                                opccion = 4;
                            }
                            break;
                        case 3:
                            System.out.println("Depositar dinero:");
                            if (!depositar_dinero()) {
                                opccion = 4;
                            }
                            break;
                        case 4:
                            System.out.println("Gracias por elegirnos!!!");
                            break;
                        default:
                            intentos_opccion --;
                            System.out.println("Te quedan "+intentos_opccion+" intentos!");
                            System.out.println("INGRESE UNA OPCIÓN VALIDA!!!");
                            if (intentos_opccion == 0) {
                                System.out.println("ERROR DE CAPA 8 xd");
                                opccion = 4;
                            }
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
        scc.close();
    }
     
     public static void consultar_saldo(){
         System.out.println("Saldo disponible: "+saldo);
         System.out.println("prueba");
     }
    
    public static boolean retirar_dinero(){
        Scanner sc = new Scanner(System.in);
        int intentos_retiro = 3;
    
        while (intentos_retiro > 0) {
            System.out.println("Ingrese el monto a retirar:");
            double monto = sc.nextDouble();
            
            if (monto <= 0) {
                System.out.println("El monto debe ser mayor a 0");
                intentos_retiro = intentos_retiro -1;
                System.out.println("Te quedan " + intentos_retiro + " intentos");
            } else if (monto <= saldo) {
                saldo = saldo - monto;
                System.out.println("Retiro exitoso!");
                System.out.println("Nuevo saldo: " + saldo);
                return true;
            } else {
                intentos_retiro = intentos_retiro -1;
                System.out.println("Monto no valido. Te quedan " + intentos_retiro + " intentos");
            }
        }
        System.out.println("ERROR DE CAPA 8 xd");
        return false;
    }
    
    public static boolean depositar_dinero(){
        Scanner sc = new Scanner(System.in);
        int intentos_deposito = 3;
        
        while (intentos_deposito > 0) {
            System.out.println("Ingrese el monto a depositar:");
            double monto = sc.nextDouble();
            
            if (monto <= 0) {
                intentos_deposito = intentos_deposito -1;
                System.out.println("El monto debe ser mayor a 0. Te quedan " + intentos_deposito + " intentos");
            } else {
                saldo = saldo + monto;
                System.out.println("Deposito exitoso!");
                System.out.println("Nuevo saldo: " + saldo);
                return true;
            }
        }
        System.out.println("ERROR DE CAPA 8 xd");
        return false;
    }
}