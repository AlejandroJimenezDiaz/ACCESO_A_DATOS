package controller;

import java.io.*;
import java.util.Scanner;

public class gestorFicheroCombinado {

    public void cifrado(String path){
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;
        System.out.println("Escribe el mensaje que quieres guardar ");
        String mensaje = scanner.nextLine();
        System.out.println("Por favor , indica la fase de cifrado del mensaje ");
        int fase = scanner.nextInt();

        try {
            fileWriter = new FileWriter(file,false);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                fileWriter.write(((int)letra)*fase + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error en los permisos");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("No se puede cerrar el archivo");
            }
        }
    }

    public void descifrarFichero(String path){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor indica la fase de descifrado del mensaje ");
        int fase = scanner.nextInt();

        File file = new File(path);
        BufferedReader bufferedReader= null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = null;
            while ((lectura = bufferedReader.readLine()) != null) {
               int codigo = Integer.parseInt(lectura);
                System.out.print((char) (codigo/fase));
            }

        } catch (IOException e) {
            System.out.println("Error en los permisos");
        }

    }


}
