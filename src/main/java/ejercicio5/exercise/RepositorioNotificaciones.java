package ejercicio5.exercise;

import java.util.HashSet;
import java.util.Set;

public class RepositorioNotificaciones implements Mediator{

    private final Set<Persona> observers = new HashSet<>();

    public RepositorioNotificaciones addPersona(Persona persona){
        observers.add(persona);
        return this;
    }

    public void removePersona(Persona persona){
        observers.remove(persona);
    }

    @Override
    public void send(String msg) {
        for (Persona observer : observers) {
            observer.received(msg);
        }
    }
}
