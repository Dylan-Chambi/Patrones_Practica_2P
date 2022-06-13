package ejercicio7.exercise;

public class AgenteCreditoHandler implements IPrestamoHandler {
    private IPrestamoHandler next;
    @Override
    public void setNext(IPrestamoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Prestamo prestamo) {
        double porcentajeDePago = prestamo.getPrestamoPagado() / prestamo.getPrestamoTotal();
        if (porcentajeDePago >= 0.25 && porcentajeDePago <= 0.5) {
            System.out.println("Pago realizado al agente de credito, y le ofrece refinanciar el prestamo");
        } else {
            next.criteriaHandler(prestamo);
        }
    }

    @Override
    public IPrestamoHandler next() {
        return next;
    }
}
