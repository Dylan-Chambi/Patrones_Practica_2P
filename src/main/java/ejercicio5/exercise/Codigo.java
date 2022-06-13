package ejercicio5.exercise;

public class Codigo implements IPrototype {
    private String nombreClase;
    private String codigoClase;

    public Codigo(String nombreClase, String codigoClase) {
        this.nombreClase = nombreClase;
        this.codigoClase = codigoClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }

    public String toString(){
        return "Nombre clase: "+nombreClase+"\nCodigo clase: "+codigoClase;
    }

    @Override
    public Codigo clone() {
        return new Codigo(nombreClase,codigoClase);
    }
}
