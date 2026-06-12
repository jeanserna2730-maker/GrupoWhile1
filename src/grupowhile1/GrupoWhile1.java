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
            
        }
    }
}
