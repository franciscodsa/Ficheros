package escribirFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploEscribir {
    public static void main(String[] args) {
        // Escribo la ruta raíz
        String raíz = "Texto\\src\\escribirFicheros\\";
        // La encadeno al nombre del fichero con el que quiero trabajar para tener la ruta completa
        String archivo = raíz + "fichero.txt";
        // con esa ruta creo un objeto de tipo File
        File file = new File(archivo);
        // Creamos un objeto escrito con FileWriter y le indicamos si queremos añadir al final o sobreescribir (append)
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(file, false);
            for (int i = 0; i < 10; i++) {
                escritor.write("Estoy machacando en mi ficherito.\n");
            }
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Excepción E/S");
        } finally {
            try {
                escritor.close();
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }
}
