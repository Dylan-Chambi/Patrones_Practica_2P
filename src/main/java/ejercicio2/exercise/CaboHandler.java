package ejercicio2.exercise;

public class CaboHandler implements IEjercitoHandler {
    private IEjercitoHandler next;
    @Override
    public void setNext(IEjercitoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Orden orden) {
         if (orden.equals(Orden.LIMPIEZA)){
            System.out.println("Cabo se encarga de la limpieza");
        }else{
            next.criteriaHandler(orden);
        }

    }

    @Override
    public IEjercitoHandler next() {
        return next;
    }
}
