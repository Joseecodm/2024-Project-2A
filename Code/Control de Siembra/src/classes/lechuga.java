package classes;

/**
 *
 * @author Josee
 */
public class lechuga {

    private int id;
    private String fechaPlantacion;
    private double temperatura;
    private double humedad;
    private String longitud;
    private double amperaje;

    public lechuga(int id, String fechaPlantacion, double temperatura, double humedad, String longitud, double amperaje) {

        this.id = id;
        this.fechaPlantacion = fechaPlantacion;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.longitud = longitud;
        this.amperaje = amperaje;
    }

    public String getInfo() {

        return "ID: " + id + ", Fecha de Plantación: " + fechaPlantacion + ", Temperatura: " + temperatura + " °C, Humedad: " + humedad + "%, Longitud: " + longitud + " cm" + ", El amperaje es de : "+ amperaje + " A";
    }

    public int getId() {

        return id;
    }
}
