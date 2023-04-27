package objetoFile;

import java.io.File;
import java.io.IOException;

public class EjemplosFile {
    public static void main(String[] args) {
        // para todo lo relacionado con esta parte necesitamos un objeto File
        String raíz = "Texto\\src\\objetoFile\\";
        String archivo = raíz + "archivo.md"; // la ruta en la que esta o estará el fichero o la carpeta
        File file = new File(archivo); //
        System.out.println("Vamos a ver los métodos que tiene File");

        if (!file.exists()) { // si el fichero no existe, lo creamos
            try {
                  boolean creado = file.createNewFile();
                  if (creado) {
                      System.out.println("El fichero se ha creado en la ruta: " + file.getAbsolutePath() );
                  }
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("Problema al crear el fichero.");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("¿Es un fichero? " + file.isFile());
        System.out.println("¿Es un directorio? " + file.isDirectory());
        System.out.println("Ruta del archivo: " + file.getAbsolutePath());
        System.out.println("Permisos: ");
        System.out.println("  * lectura: " + file.canRead());
        System.out.println("  * escritura: " + file.canWrite());
        System.out.println("  * ejecución: " + file.canExecute());

        String ruta2 = raíz + "archivo.txt";
        File file1 = new File(ruta2);
        if (file1.exists()) {
           boolean eliminado = file1.delete();
           if (eliminado) {
               System.out.println("El fichero " + ruta2 + " ha sido eliminado.");
           }
        }

        // para renombrar un fichero le tenemos que dar toda la ruta, no sólo el nombre
        if (file.exists()) {
            boolean renombrado = file.renameTo(new File(raíz + "fichero.md")) ;
        }
    }
}
