package ejercicio2.exercise;

public class GeneralHandler implements IEjercitoHandler {
    private IEjercitoHandler next;
    @Override
    public void setNext(IEjercitoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Orden orden) {
        if(orden.equals(Orden.ENTREVISTA)){
            System.out.println("General se encarga de la entrevista");
        }else{
            next.criteriaHandler(orden);
        }
    }

    @Override
    public IEjercitoHandler next() {
        return next;
    }
}
