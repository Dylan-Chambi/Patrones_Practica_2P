package ejercicio2.exercise;

public class ManagerHandler implements IEjercitoHandler {

    private IEjercitoHandler next;

    @Override
    public void setNext(IEjercitoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Orden orden) {
        GeneralHandler general = new GeneralHandler();
        this.setNext(general);

        TenienteHandler teniente = new TenienteHandler();
        general.setNext(teniente);

        CoronelHandler coronel = new CoronelHandler();
        teniente.setNext(coronel);

        CaboHandler cabo = new CaboHandler();
        coronel.setNext(cabo);

        this.next.criteriaHandler(orden);
    }

    @Override
    public IEjercitoHandler next() {
        return next;
    }
}
