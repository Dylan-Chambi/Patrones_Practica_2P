package ejercicio2.exercise;

public class CoronelHandler implements IEjercitoHandler {
    private IEjercitoHandler next;
    @Override
    public void setNext(IEjercitoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Orden orden) {
        if (orden.equals(Orden.DESBLOQUEOS)) {
            System.out.println("Coronel se encarga de los desbloqueos");
        } else if(orden.equals(Orden.MANIFESTACIONES)){
            System.out.println("Coronel se encarga de las manifestaciones");
        }else{
            next.criteriaHandler(orden);
        }

    }

    @Override
    public IEjercitoHandler next() {
        return next;
    }
}
