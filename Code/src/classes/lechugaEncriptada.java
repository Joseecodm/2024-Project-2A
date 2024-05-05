package classes;

/**
 *
 * @author Josee
 */
public class lechugaEncriptada {

    private int id;
    private String fechaPlantacion;
    private double temperatura;
    private double humedad;
    private String longitud;
    private String textoInfo;

    public lechugaEncriptada(int id, String fechaPlantacion, double temperatura, double humedad, String longitud) {
        this.id = id;
        this.fechaPlantacion = fechaPlantacion;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.longitud = longitud;
        this.textoInfo = generarTextoInfo();
    }

    private String generarTextoInfo() {
        return "ID: " + id + ", Fecha de Plantación: " + fechaPlantacion + ", Temperatura: " + temperatura + " °C, Humedad: " + humedad + "%, Longitud: " + longitud + " cm";
    }

    public String getInfo() {
        return textoInfo;
    }

}
