package leerFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        // Escribo la ruta raíz
        String raíz = "Texto\\src\\leerFicheros\\";
        // La encadeno al nombre del fichero con el que quiero trabajar para tener la ruta completa
        String archivo = raíz + "HolaMundo.java";
        // con esa ruta creo un objeto de tipo File
        File fHolaM = new File(archivo);
        if (fHolaM.exists()) {
            //System.out.println("Existe.");
        }
        Scanner lector = null;
        try { // esto me lo hace automáticamente cuando intento instanciar el scanner
            lector = new Scanner(fHolaM); // en vez de System.in pasamos el objeto File
            // con el Scanner leemos línea a línea
            while (lector.hasNext()) { // si no comprobamos que hay una siguiente línea antes de leerla, puede saltar un error EOF (End of File)
                String linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Fichero no encontrado.");
            System.out.println("Lo estás buscando en: " + fHolaM.getAbsolutePath());
        } finally {
            lector.close();
        }
    }
}
