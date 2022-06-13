package ejercicio5.exercise;

import java.util.List;

public class Client {

    public static void main(String[]args) {
        RepositorioNotificaciones repositorioNotificaciones = new RepositorioNotificaciones();
        Github github = new Github(repositorioNotificaciones);
        Git git = new Git();

        Codigo codigo1 = new Codigo("Originator.java", "public class Originator ");
        Codigo codigo2 = new Codigo("Caretaker.java", "public class Caretaker ");
        git.gitAdd(codigo1);
        git.gitAdd(codigo2);
        github.push("commit1", git.createCommit());


        Codigo codigo3 = new Codigo("Mediator.java", "public class Mediator ");
        Codigo codigo4 = new Codigo("Persona.java", "public class Persona ");
        git.gitAdd(codigo3);
        git.gitAdd(codigo4);
        github.push("commit2", git.createCommit());

        Codigo codigo5 = new Codigo("IPrototype.java", "public interface IPrototype ");
        git.gitAdd(codigo5);
        github.push("commit3", git.createCommit());

        Codigo codigo6 = new Codigo("Commit.java", "public class Commit implements IPrototype ");
        git.gitAdd(codigo6);
        github.push("commit4", git.createCommit());

        Codigo codigo7 = new Codigo("Memento.java", "public class Memento ");
        git.gitAdd(codigo7);
        github.push("commit5", git.createCommit());





        Desarrollador desarrollador1 = new Desarrollador("Python", "Carlos");
        Desarrollador desarrollador2 = new Desarrollador("Java", "Juan");
        Desarrollador desarrollador3 = new Desarrollador("Prolog", "Esteban");

        repositorioNotificaciones.addPersona(desarrollador1);
        repositorioNotificaciones.addPersona(desarrollador2);
        repositorioNotificaciones.addPersona(desarrollador3);

        System.out.println("--------------------------Mensajes a desarrolladores----------------------------");
        List<Codigo> codigoRecuperado = git.restoreCommit(github.restoreCommit("commit1"));

        System.out.println("--------------------------Archivos de codigo restaurado----------------------------");
        for (int i = 0; i < codigoRecuperado.size(); i++) {
            System.out.println("Archivo de codigo " + (i+1) + ": ");
            System.out.println(codigoRecuperado.get(i));
        }

        repositorioNotificaciones.removePersona(desarrollador1);
        repositorioNotificaciones.removePersona(desarrollador2);
        repositorioNotificaciones.removePersona(desarrollador3);

        Desarrollador desarrollador4 = new Desarrollador("Javascript", "Marie");
        Desarrollador desarrollador5 = new Desarrollador("Scala", "Jhones");
        Desarrollador desarrollador6 = new Desarrollador("C#", "Alexa");

        repositorioNotificaciones.addPersona(desarrollador4);
        repositorioNotificaciones.addPersona(desarrollador5);
        repositorioNotificaciones.addPersona(desarrollador6);

        System.out.println("--------------------------Mensajes a desarrolladores----------------------------");
        List<Codigo> codigoRecuperado2 = git.restoreCommit(github.restoreCommit("commit5"));

        System.out.println("--------------------------Archivos de codigo restaurado----------------------------");
        for (int i = 0; i < codigoRecuperado2.size(); i++) {
            System.out.println("Archivo de codigo " + (i+1) + ": ");
            System.out.println(codigoRecuperado2.get(i));
        }
    }
}
