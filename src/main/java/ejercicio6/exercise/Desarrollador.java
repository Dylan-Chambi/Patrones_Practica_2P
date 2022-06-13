package ejercicio6.exercise;

public class Desarrollador extends Persona {
    private String cargo;

    public Desarrollador(Mediator mediator, String nombre, String cargo) {
        super(mediator);
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void sendToGroup(String msg) {
        mediator.sendToGroup(msg,this);
    }

    @Override
    public void sendToPerson(String msg, Persona receiver) {
        mediator.sendToPerson(msg,this,receiver);
    }

    @Override
    public void receivedFromGroup(String msg, Persona sender) {
        System.out.println("-----------------------Mensaje Recibido - Grupo-----------------------");
        System.out.println(this.nombre + " recibio de un grupo el mensaje de " + sender.getNombre() + ": ");
        System.out.println("[" + msg + "]");
    }

    @Override
    public void receivedFromPerson(String msg, Persona sender) {
        System.out.println("-----------------------Mensaje Recibido - 1a1-----------------------");
        System.out.println(this.nombre+" recibio de "+sender.getNombre()+" el mensaje: ");
        System.out.println("["+msg+"]");
    }
}
