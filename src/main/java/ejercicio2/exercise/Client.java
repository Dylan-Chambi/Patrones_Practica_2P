package ejercicio2.exercise;

public class Client {
    public static void main(String []args){
        ManagerHandler managerHandler= new ManagerHandler();

        managerHandler.criteriaHandler(Orden.ENTREVISTA);

        managerHandler.criteriaHandler(Orden.DISCIPLINA);

        managerHandler.criteriaHandler(Orden.DESBLOQUEOS);

        managerHandler.criteriaHandler(Orden.MANIFESTACIONES);

        managerHandler.criteriaHandler(Orden.LIMPIEZA);
    }
}
