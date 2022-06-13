package ejercicio6.exercise;

public class Client {

    public static void main(String[]args){
        SalaChat salaChat = new SalaChat();

        Desarrollador desarrollador1 = new Desarrollador(salaChat, "Juan", "DevOps");
        Desarrollador desarrollador2 = new Desarrollador(salaChat, "Pedro", "FrontEnd");
        Desarrollador desarrollador3 = new Desarrollador(salaChat, "Maria", "BackEnd");
        Desarrollador desarrollador4 = new Desarrollador(salaChat, "Ana", "BackEnd");
        Desarrollador desarrollador5 = new Desarrollador(salaChat, "Jorge", "BackEnd");
        Desarrollador desarrollador6 = new Desarrollador(salaChat, "Luis", "DevOps");
        Desarrollador desarrollador7 = new Desarrollador(salaChat, "Carlos", "FrontEnd");
        Desarrollador desarrollador8 = new Desarrollador(salaChat, "Andrea", "FrontEnd");
        Desarrollador desarrollador9 = new Desarrollador(salaChat, "Jose", "FrontEnd");
        Desarrollador desarrollador10 = new Desarrollador(salaChat, "Sofia", "BackEnd");

        desarrollador1.sendToPerson("Estoy subiendo una mejora del codigo que hiciste", desarrollador2);

        salaChat
                .addToGroup(desarrollador1)
                .addToGroup(desarrollador2)
                .addToGroup(desarrollador3)
                .addToGroup(desarrollador4)
                .addToGroup(desarrollador5)
                .addToGroup(desarrollador6)
                .addToGroup(desarrollador7)
                .addToGroup(desarrollador8)
                .addToGroup(desarrollador9)
                .addToGroup(desarrollador10);

        desarrollador10.sendToGroup("Estoy tomando la tarea X");
        desarrollador6.sendToGroup("Ya termine la tarea Y y estoy subiendo la implementacion");
    }

}
