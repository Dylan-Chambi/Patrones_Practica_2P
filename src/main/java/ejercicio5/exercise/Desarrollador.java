package ejercicio5.exercise;

public class Desarrollador extends Persona {
    private String lenguajeFavorito;

    public Desarrollador(String lenguajeFavorito, String nombre) {
        super(nombre);
        this.lenguajeFavorito = lenguajeFavorito;
    }

    @Override
    public void send(String msg) {
        throw new UnsupportedOperationException("Un Desarrolador no puede enviar un mensaje");
    }

    @Override
    public void received(String msg) {
        System.out.println(this.nombre + " recibio: [" + msg + "]");
    }
}
