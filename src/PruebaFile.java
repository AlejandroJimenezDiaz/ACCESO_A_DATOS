import java.io.File;
import java.io.IOException;

public class PruebaFile {

//He creado un metodo para crear archivos
public static void metodoCreacionFiles(String ruta){
    File creandoFichero2 = new File(ruta);
    if (creandoFichero2.exists()) {
        System.out.println("ya existe este fichero");
    } else {
        try {
            creandoFichero2.createNewFile();
        } catch (IOException e) {
            System.out.println("No se puede crear el fichero");
        }
    }
}
//Creo un metodo para ver carpetas y archivos que contiene

public static void contiene (File ficheroDirectorio){
    File [] nombresFiles2 = ficheroDirectorio.listFiles();
    if (nombresFiles2 != null) {
        for (File nombres : nombresFiles2) {
            if(nombres.isDirectory()){
                System.out.println("Es una carpeta : " + nombres.getName());
                contiene(nombres);
            }else if (nombres.isFile()){
                System.out.println("Es un txt : " + nombres.getName());
            }
        }
    }
}



    public static void main(String[] args) {
    //Creo los ficheros (objeto , para poder apuntar y utilizar metodos)
        File ficheroDirectorio = new File("src/resources/directorio");
        File creandoFichero1 = new File("src/resources/directorio/subcarpeta/creoFichero.txt");
    //Utilizo algunos metodos y los imprimo por consola
        System.out.println("La ruta absoluta es : "+ficheroDirectorio.getAbsolutePath());
        System.out.println("nombre del file al cual apunta es : "+ficheroDirectorio.getName());
        System.out.println("tamaño del file : " +ficheroDirectorio.getName() +" -> tamaño : "+ficheroDirectorio.length());
        System.out.println("existe el file : "+ficheroDirectorio.getName() +" -> "+ficheroDirectorio.exists());
        System.out.println("Contiene dentro : "+ficheroDirectorio.listFiles().length);
    //Para Crear un fichero primero preguntamos si ya esta creado , aparece como error por no tener permisos . Vamos
    //al error y damos a la opcion surround try/catch.
        System.out.println(creandoFichero1.exists());
        if (creandoFichero1.exists()) {
            System.out.println("ya existe este fichero");
        } else {
            try {
                creandoFichero1.createNewFile();
            } catch (IOException e) {
                System.out.println("No se puede crear el fichero ");
            }
        }
    // 1 -> Obtener todos los nombres de los ficheros del directorio llamado directorio
    // Utilizo mi "File ficheroDirectorio" porque tiene un ruta absoluta y esta apuntando al directorio llamado directorio
    // Pregunto si el fichero existe y si es directorio
        System.out.println("CONTENIDO DEL DIRECTORIO : "+ficheroDirectorio.getName());
    if (ficheroDirectorio.exists() && ficheroDirectorio.isDirectory()) {
        File [] nombresFiles = ficheroDirectorio.listFiles();   //creo un array para almacenar los nombres encontrados
        if (nombresFiles != null) {
            for (File nombres : nombresFiles) { // nombres es tipo file para poder acceder a sus metodos y asi puedo diferenciar entre carpeta o fichero
                if(nombres.isDirectory()){
                    System.out.println("Es una carpeta : " + nombres.getName());
                }else if (nombres.isFile()){
                    System.out.println("Es un txt : " + nombres.getName());
                }
            }
        }

    }
    //2 -> Crear un subdirectorio dentro de la carpeta directorio y listar el nombre de todos los archivos
    // utilizo el metodo creacionFiles
        System.out.print("ACTIVIDAD 2 , LISTA DE TODOS LOS ARCHIVOS DENTRO DE CARPETA Y SUBCARPETA ");
    metodoCreacionFiles("src/resources/directorio/subcarpeta/creoFicheroMetodo.txt");
    //Creo un metodo para poder llamarlo en bucle
        File buscador = new File("src/resources/directorio");
        if (buscador.exists() && buscador.isDirectory()) {
            contiene(buscador);
        }

    //3 -> Listar nombres de todos los ficheros y directorios de una ruta concreta , por ejemplo C:/Users
    // En mi caso voy hacerlo del escritorio , ya he creado un metodo .
        System.out.print("ACTIVIDAD 3 , LISTA DE TODOS LOS ARCHIVOS EN MI CASO DE ESCRITORIO ");
        File buscador2 = new File("C:/Users/Alejandro/Desktop");
        if (buscador.exists() && buscador.isDirectory()) {
            contiene(buscador2);
        }
    }
}

