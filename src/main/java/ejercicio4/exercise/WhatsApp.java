package ejercicio4.exercise;

import java.util.HashSet;

public class WhatsApp implements Mediator{
    private final HashSet<Usuario> usuarios;


    public WhatsApp(){
        usuarios = new HashSet<>();
    }

    public WhatsApp addToGroup(Usuario usuario){
        this.usuarios.add(usuario);
        return this;
    }

    public void removeFromGroup(Usuario usuario){
        this.usuarios.remove(usuario);
    }


    @Override
    public void sendToGroup(String msg, Persona persona) {
        for (Usuario usuario : this.usuarios) {
            if (!usuario.equals(persona)){
                usuario.receivedFromGroup(msg);
            }
        }
    }

    @Override
    public void sendToPerson(String msg, Persona sender, Persona receiver) {
        receiver.receivedFromPerson(msg,sender);
    }
}
