package ejercicio4.exercise;

public class Usuario extends Persona {
    private String name;
    private String phoneNumber;

    public Usuario(Mediator mediator, String name, String phoneNumber) {
        super(mediator);
        this.name = name;
        this.username = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public void receivedFromGroup(String msg) {
        System.out.println("-----------------------Mensaje Recibido - Grupo-----------------------");
        System.out.println(this.name + " recibio de un grupo el mensaje: ");
        System.out.println(msg);
    }

    @Override
    public void receivedFromPerson(String msg, Persona sender) {
        System.out.println("-----------------------Mensaje Recibido - 1a1-----------------------");
        System.out.println(this.name+" recibio de "+sender.getUsername()+" el mensaje: ");
        System.out.println(msg);
    }
}
