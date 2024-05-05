package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Josee
 */
public class registroLechugas {

    private ArrayList<lechuga> lechugas;

    public registroLechugas() {

        lechugas = new ArrayList<>();
    }

    public void agregarLechuga(lechuga lechuga) {

        lechugas.add(lechuga);
    }

    public void guardarRegistro() {

        try (PrintWriter writer = new PrintWriter(new FileWriter("registro_lechugas.txt"))) {

            for (lechuga lechuga : lechugas) {

                writer.println(lechuga.getInfo());
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
