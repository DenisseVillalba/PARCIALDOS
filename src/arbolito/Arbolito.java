
package arbolito;

import java.util.Scanner;

public class Arbolito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // astediscos iniciales
        System.out.print("Ingrese el nivel inicial del arbol: ");
        int Inicio = scanner.nextInt();
        //astediscos finales 
        System.out.print("Ingrese el nivel final del arbol: ");
        int Final = scanner.nextInt();

        if (Inicio > Final)
       
                {
            System.out.println("El inicio debe ser menor o igual al final.");
        } else {
            // Generar el árbol desde el nivel inicial hasta el nivel final
            for (int i = Inicio; i <= Final; i++) {
                // Imprimir espacios para centrar las "x"
                for (int j = Final - i; j > 0; j--) {
                    System.out.print(" ");
                }

                // Imprimir los "#" 
                for (int j = 1; j <= i; j++) {
                    System.out.print("# ");
                }

                System.out.println();
            }
        }
    }
}
        
        
