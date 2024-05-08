package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Josee
 */
public class registroLechugasEncriptadas {

    private ArrayList<lechugaEncriptada> lechugasEncriptadas;

    public registroLechugasEncriptadas() {
        lechugasEncriptadas = new ArrayList<>();
    }

    public void agregarLechuga(lechugaEncriptada lechuga) {
        lechugasEncriptadas.add(lechuga);
    }

    public void guardarRegistroEncriptado() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("registro_lechugas_encriptado.txt", true))) {
            for (lechugaEncriptada lechuga : lechugasEncriptadas) {
                String textoEncriptado = encriptadorAES.encriptar(lechuga.getInfo());
                if (textoEncriptado != null) {
                    writer.println(textoEncriptado);
                } else {
                    System.err.println("Error al encriptar el registro");
                }
            }
            System.out.println("Registro encriptado guardado en registro_lechugas_encriptado.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
