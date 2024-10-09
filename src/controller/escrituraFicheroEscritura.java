package controller;

import java.io.*;
import java.util.Scanner;

public class escrituraFicheroEscritura {

    public void escrituraFileWriter(String path){
        Scanner leer = new Scanner(System.in);
        boolean siono = true;
        System.out.println("¿Que quieres escribir en el fichero?");
        String escritura = leer.nextLine();
        System.out.println("¿Quieres sobrescribir en el fichero?");
        String eleccion = leer.nextLine();

        if(eleccion.toLowerCase().equals("si")) {
            siono = false;
        }else if(eleccion.toLowerCase().equals("no")){
            siono = true;
        }


        File file = new File(path);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, siono);
            fw.write(escritura);
            fw.write("\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero , por permisos" + e.getMessage());
        }finally{
            try {
                fw.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
    public void escrituraBufferWriter(String path){
        Scanner leer = new Scanner(System.in);
        boolean siono = false;
        System.out.println("¿Que quieres escribir en el fichero?");
        String escritura = leer.nextLine();
        System.out.println("¿Quieres sobrescribir en el fichero?");
        String eleccion = leer.nextLine();

        if(eleccion.toLowerCase().equals("si")) {
            siono = false;
        }else if(eleccion.toLowerCase().equals("no")){
            siono = true;
        }

        File file = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file, siono);
            bw = new BufferedWriter(fw);
            //fw.write(escritura);
            bw.newLine();
            bw.write(escritura);

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero , por permisos" + e.getMessage());
        }finally{
            try {
                bw.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el fichero" +e);
            }
        }
    }

    public void escrituraPrintWriter(String path){
        Scanner leer = new Scanner(System.in);
        boolean siono = false;
        System.out.println("¿Que quieres escribir en el fichero?");
        String escritura = leer.nextLine();
        System.out.println("¿Quieres sobrescribir en el fichero?");
        String eleccion = leer.nextLine();

        if(eleccion.toLowerCase().equals("si")) {
            siono = false;
        }else if(eleccion.toLowerCase().equals("no")){
            siono = true;
        }

        File file = new File(path);
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(file, siono);
            pw = new PrintWriter(fw);
            pw.println(escritura);


        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero , por permisos" + e.getMessage());
        }finally{
            try {
                pw.close();
            } catch (NullPointerException e) {
                System.out.println("Error al cerrar el fichero" +e);
            }
        }
    }


    }

