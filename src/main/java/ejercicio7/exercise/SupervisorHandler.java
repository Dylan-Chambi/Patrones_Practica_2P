package ejercicio7.exercise;

public class SupervisorHandler implements IPrestamoHandler {
    private IPrestamoHandler next;
    @Override
    public void setNext(IPrestamoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Prestamo prestamo) {
        double porcentajeDePago = prestamo.getPrestamoPagado() / prestamo.getPrestamoTotal();
        if (porcentajeDePago > 0.5 && porcentajeDePago < 1) {
            System.out.println("Pago realizado al supervisor, y le ofrece nuevos prestamos");
            prestamo.setPuedePrestarse(true);
        } else {
            next.criteriaHandler(prestamo);
        }
    }

    @Override
    public IPrestamoHandler next() {
        return next;
    }
}
