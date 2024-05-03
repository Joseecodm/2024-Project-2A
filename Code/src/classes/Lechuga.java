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
    private String longitud;

    public Lechuga(int id, String fechaPlantacion, double temperatura, double humedad, String longitud) {

        this.id = id;
        this.fechaPlantacion = fechaPlantacion;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.longitud = longitud;
    }

    public String getInfo() {

        return "ID: " + id + ", Fecha de Plantación: " + fechaPlantacion + ", Temperatura: " + temperatura + " °C, Humedad: " + humedad + "%, Longitud: " + longitud + " cm";
    }

    public int getId() {

        return id;
    }
}
