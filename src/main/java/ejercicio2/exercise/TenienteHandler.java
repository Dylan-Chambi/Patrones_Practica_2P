package ejercicio2.exercise;

public class TenienteHandler implements IEjercitoHandler {
    private IEjercitoHandler next;
    @Override
    public void setNext(IEjercitoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Orden orden) {
        if (orden.equals(Orden.DISCIPLINA)){
            System.out.println("Teniente se encarga de la disciplina");
        }else{
            next.criteriaHandler(orden);
        }
    }

    @Override
    public IEjercitoHandler next() {
        return next;
    }
}
