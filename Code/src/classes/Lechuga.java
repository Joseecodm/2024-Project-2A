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

    // Método para obtener la información de la lechuga
    public String getInfo() {
        
        // Devolver en el archivo una cadena de texto
        return "ID: " + id + ", Fecha de Plantación: " + fechaPlantacion + ", Temperatura: " + temperatura + " °C, Humedad: " + humedad + "%, Longitud: " + longitud + " cm";
    }

    // Método para obtener el ID de la lechuga
    public int getId() {
        // Retornar el ID
        return id;
    }
}
