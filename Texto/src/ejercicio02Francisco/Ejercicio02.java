package ejercicio02Francisco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        File csv = new File("Texto\\src\\ejercicio02Francisco\\Restaurantes.csv");
        Scanner lector = null;
        try {
            lector = new Scanner(csv);
            lector.nextLine();
            ArrayList<String[]> restaurantes = new ArrayList<>();
            while (lector.hasNext()) {
                 restaurantes.add(lector.nextLine().split(","));
            }
            for (String [] restaurante : restaurantes) {
                if (restaurante[4].startsWith("6")){
                    System.out.println(Arrays.toString(restaurante));
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado.");
            System.out.println("Lo estás buscando en: " + csv.getAbsolutePath());
        } finally {
            if (lector != null) {
                lector.close();
            }
        }

    }
}
