package ejercicio5.exercise;

public abstract class Persona {
       protected String nombre;

       public Persona(String nombre){
              this.nombre=nombre;
       }

       public abstract void send(String msg);
       public abstract void received(String msg);
}
