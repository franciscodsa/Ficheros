package ejercicio01Francisco;

import java.io.File;
import java.util.Scanner;


public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica ruta");
        String ruta = scanner.nextLine();
        comprobacionDeRuta(ruta);
    }

    public static void comprobacionDeRuta(String ruta) {
        File file = new File(ruta);
        existeFichero(file);
        esDirectorioFichero(file);
    }

    public static void existeFichero (File file) {
        if (!file.exists()){
            System.out.println("No existe");
        }else {
            System.out.println("Sí existe");
        }
    }

    public static void esDirectorioFichero (File file) {
        if (file.isDirectory()){
            System.out.println("Es un directorio");
        }else if (file.isFile()) {
            System.out.println("Es un fichero");
            mostrarDatosDeFichero(file);
        }
    }

    public static void mostrarDatosDeFichero (File file) {
        System.out.println("Nombre: " + file.getName());
        System.out.println("Tamaño: " + file.length());
        boolean read = file.canRead();
        boolean write = file.canWrite();
        boolean execute = file.canExecute();
        System.out.println(" Permisos:" +
                "\n\t- Lectura: " + read +
                "\n\t- Escritura: " + write +
                "\t- Ejecución: " + execute);
    }

}
