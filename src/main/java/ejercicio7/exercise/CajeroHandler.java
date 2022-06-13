package ejercicio7.exercise;

public class CajeroHandler implements IPrestamoHandler {
    private IPrestamoHandler next;

    @Override
    public void setNext(IPrestamoHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Prestamo prestamo) {
        double porcentajeDePago = prestamo.getPrestamoPagado() / prestamo.getPrestamoTotal();
        if (porcentajeDePago < 0.25) {
            System.out.println("Pago realizado al cajero");
        } else {
            next.criteriaHandler(prestamo);
        }
    }

    @Override
    public IPrestamoHandler next() {
        return next;
    }
}
