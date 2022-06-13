package ejercicio6.exercise;

import java.util.HashSet;

public class SalaChat implements Mediator {
    private final HashSet<Persona> personasSet;


    public SalaChat(){
        personasSet = new HashSet<>();
    }

    public SalaChat addToGroup(Persona desarrollador){
        this.personasSet.add(desarrollador);
        return this;
    }

    public void removeFromGroup(Persona desarrollador){
        this.personasSet.remove(desarrollador);
    }


    @Override
    public void sendToGroup(String msg, Persona personaSender) {
        for (Persona personaReciever : this.personasSet) {
            if (!personaReciever.equals(personaSender)){
                personaReciever.receivedFromGroup(msg, personaSender);
            }
        }
    }

    @Override
    public void sendToPerson(String msg, Persona sender, Persona receiver) {
        receiver.receivedFromPerson(msg,sender);
    }
}
