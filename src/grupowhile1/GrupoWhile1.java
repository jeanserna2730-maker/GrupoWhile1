/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupowhile1;
import java.util.Scanner;
public class GrupoWhile1 {

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
                            break;
                        case 2:
                            System.out.println("Retirar dinero:");
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
    }
}
