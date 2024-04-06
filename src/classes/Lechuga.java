package classes;

/**
 *
 * @author Josee
 */
public class Lechuga {

    private int id;
    private String fechaPlantacion;
    private double temperatura;
    private double humedad;

    // Constructor
    public Lechuga(int id, String fechaPlantacion, double temperatura, double humedad) {
        this.id = id;
        this.fechaPlantacion = fechaPlantacion;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    // Método para obtener la información de la lechuga
    public String getInfo() {
        return "ID: " + id + ", Fecha de Plantación: " + fechaPlantacion + ", Temperatura: " + temperatura + ", Humedad: " + humedad;
    }

    // Método para obtener el ID de la lechuga
    public int getId() {
        return id;
    }
}
