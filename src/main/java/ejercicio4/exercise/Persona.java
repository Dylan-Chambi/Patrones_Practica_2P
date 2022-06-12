package ejercicio4.exercise;

public abstract class Persona {

       protected String username;
       protected Mediator mediator;

       public Persona(Mediator mediator){
              this.mediator=mediator;
       }

       public String getUsername() {
              return username;
       }

       public void setUsername(String username) {
              this.username = username;
       }

       public Mediator getMediator() {
              return mediator;
       }

       public void setMediator(Mediator mediator) {
              this.mediator = mediator;
       }

       public abstract void sendToGroup(String msg);

       public abstract void sendToPerson(String msg, Persona receiver);
       public abstract void receivedFromGroup(String msg);

       public abstract void receivedFromPerson(String msg, Persona sender);
}
