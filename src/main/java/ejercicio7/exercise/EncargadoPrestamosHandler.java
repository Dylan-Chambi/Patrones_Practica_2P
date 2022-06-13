package ejercicio7.exercise;

public class EncargadoPrestamosHandler implements IPrestamoHandler {
    private IPrestamoHandler next;
    @Override
    public void setNext(IPrestamoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Prestamo prestamo) {
        double porcentajeDePago = prestamo.getPrestamoPagado() / prestamo.getPrestamoTotal();
        if (porcentajeDePago >= 1) {
            System.out.println("Prestamo totalmente pagado, aqui tiene todos sus documentos");
            prestamo.setPagoTerminado(true);
        } else {
            next.criteriaHandler(prestamo);
        }
    }

    @Override
    public IPrestamoHandler next() {
        return next;
    }
}
