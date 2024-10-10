import controller.escrituraFicheroEscritura;
import controller.gestionFicheroLectura;
import controller.gestorFicheroCombinado;

import java.util.Scanner;

public class PruebaGestionFichero {
    public static void main(String[] args) {

//         File file = new File ("src/resources/directorio");
//         File file1 = new File("src/filePrueba/ficheroParaLeer.txt");
//         gestionFichero gestionFichero = new gestionFichero();
//         gestionFichero gf1 = new gestionFichero();
//         gestionFichero gf2 = new gestionFichero();
//         gestionFichero.lecturaTextoPlano(file1.getAbsolutePath());
//         escrituraFicheroEscritura escrituraFicheroEscritura = new escrituraFicheroEscritura();
//         escrituraFicheroEscritura.escrituraFileWriter("src/resources/ficheros/escrituraFileWriter.txt");
//         escrituraFicheroEscritura.escrituraBufferWriter("src/resources/ficheros/escrituraBufferWriter.txt");
//         escrituraFicheroEscritura.escrituraPrintWriter("src/resources/ficheros/escrituraPrintWriter.txt");
//         gf1.lecturaTextoPlano("src/resources/directorio/ejemplo.md.txt");
//         gf.contieneFichero(file);
//         gf2.lecturaTextoPlano(file1.getPath());

//         GestorFicheroCombinado.cifrado("src/resources/ficheros/cifrado.txt");
//        gestionFicheroLectura descifrar = new gestionFicheroLectura();
//        descifrar.lecturaTextoPlano("src/resources/ficheros/cifrado.txt");
         gestorFicheroCombinado GestorFicheroCombinado = new gestorFicheroCombinado();
         Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {

            System.out.println("Introduce que quieres hacer");
            System.out.println("1 -> Cifrar fichero con numeros" + "\n" +
                    "2 -> Descifrar fichero numeros" + "\n" +
                    "3 -> Cifrar fichero con letras" + "\n" +
                    "4 -> Descifrar Fichero Letras" + "\n");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    GestorFicheroCombinado.cifrado("src/resources/ficheros/cifradoNumero.txt");
                    break;
                case 2:
                    GestorFicheroCombinado.descifrarFichero("src/resources/ficheros/cifradoNumero.txt");
                    break;
                case 3:
                    GestorFicheroCombinado.cifradoLetras("src/resources/ficheros/cifradoLetra.txt");
                    break;
                case 4 :
                    GestorFicheroCombinado.descifrarFicheroLetra("src/resources/ficheros/cifradoLetra.txt");
                    break;
            }
        }while (opcion != 0);
    }
}
