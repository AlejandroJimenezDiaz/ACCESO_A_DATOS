package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        // Mostramos el menú hasta que el usuario ingrese un número negativo
        do {
            System.out.println("Esto es una prueba de menú:");
            System.out.println("1. Para leer un contenedor");
            System.out.println("2. Para leer un fichero");
            System.out.println("3. Para crear un fichero");
            System.out.println("Para salir, pulsa un número negativo");

            // Leemos la opción del usuario
            number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Opción 1 seleccionada: Leer un contenedor");
                    // Aquí puedes agregar la lógica para leer un contenedor
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada: Leer un fichero");
                    // Aquí puedes agregar la lógica para leer un fichero
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada: Crear un fichero");
                    // Aquí puedes agregar la lógica para crear un fichero
                    break;
                default:
                    if (number < 0) {
                        System.out.println("Saliendo del menú...");
                    } else {
                        System.out.println("Opción no válida, intenta de nuevo.");
                    }
                    break;
            }

        } while (number >= 0); // El menú sigue hasta que el usuario introduzca un número negativo

        sc.close();  // Cerramos el scanner para liberar recursos
    }
}
