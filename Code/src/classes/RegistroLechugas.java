package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Josee
 */
public class RegistroLechugas {

    private ArrayList<Lechuga> lechugas;

    public RegistroLechugas() {

        lechugas = new ArrayList<>();
    }

    public void agregarLechuga(Lechuga lechuga) {

        lechugas.add(lechuga);
    }

    public void guardarRegistro() {

        try (PrintWriter writer = new PrintWriter(new FileWriter("registro_lechugas.txt"))) {

            for (Lechuga lechuga : lechugas) {

                writer.println(lechuga.getInfo());
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
