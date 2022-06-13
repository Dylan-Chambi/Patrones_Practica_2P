package ejercicio6.exercise;

public abstract class Persona {

       protected String nombre;
       protected Mediator mediator;

       public Persona(Mediator mediator){
              this.mediator=mediator;
       }

       public String getNombre() {
              return nombre;
       }

       public void setNombre(String nombre) {
              this.nombre = nombre;
       }

       public Mediator getMediator() {
              return mediator;
       }

       public void setMediator(Mediator mediator) {
              this.mediator = mediator;
       }

       public abstract void sendToGroup(String msg);

       public abstract void sendToPerson(String msg, Persona receiver);
       public abstract void receivedFromGroup(String msg, Persona sender);

       public abstract void receivedFromPerson(String msg, Persona sender);
}
