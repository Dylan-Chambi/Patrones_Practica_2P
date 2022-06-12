package ejercicio4.exercise;

public class Client {

    public static void main(String[]args){
        WhatsApp whatsApp = new WhatsApp();

        Usuario usuario1 = new Usuario(whatsApp, "Juan", "658465465");
        Usuario usuario2 = new Usuario(whatsApp, "Pedro", "658465465");
        Usuario usuario3 = new Usuario(whatsApp, "Maria", "658465465");
        Usuario usuario4 = new Usuario(whatsApp, "Ana", "658465465");
        Usuario usuario5 = new Usuario(whatsApp, "Jorge", "658465465");
        Usuario usuario6 = new Usuario(whatsApp, "Luis", "658465465");
        Usuario usuario7 = new Usuario(whatsApp, "Carlos", "658465465");
        Usuario usuario8 = new Usuario(whatsApp, "Andrea", "658465465");
        Usuario usuario9 = new Usuario(whatsApp, "Jose", "658465465");
        Usuario usuario10 = new Usuario(whatsApp, "Sofia", "658465465");

        usuario1.sendToPerson("Hola Pedro", usuario2);

        whatsApp
                .addToGroup(usuario1)
                .addToGroup(usuario2)
                .addToGroup(usuario3)
                .addToGroup(usuario4)
                .addToGroup(usuario5)
                .addToGroup(usuario6)
                .addToGroup(usuario7)
                .addToGroup(usuario8)
                .addToGroup(usuario9)
                .addToGroup(usuario10);

        usuario1.sendToGroup("Hola a todos");
    }

}
