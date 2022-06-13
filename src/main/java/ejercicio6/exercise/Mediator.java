package ejercicio6.exercise;

public interface Mediator {
    void sendToGroup(String msg, Persona persona);

    void sendToPerson(String msg, Persona sender, Persona receiver);
}
