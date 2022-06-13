package ejercicio7.exercise;

public class ManagerPrestamoHandler implements IPrestamoHandler {

    private IPrestamoHandler next;

    @Override
    public void setNext(IPrestamoHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Prestamo prestamo) {
        CajeroHandler cajeroHandler= new CajeroHandler();
        this.setNext(cajeroHandler);

        AgenteCreditoHandler agenteCreditoHandler = new AgenteCreditoHandler();
        cajeroHandler.setNext(agenteCreditoHandler);

        SupervisorHandler supervisorHandler = new SupervisorHandler();
        agenteCreditoHandler.setNext(supervisorHandler);

        EncargadoPrestamosHandler encargadoPrestamosHandler = new EncargadoPrestamosHandler();
        supervisorHandler.setNext(encargadoPrestamosHandler);

        this.next.criteriaHandler(prestamo);
    }

    @Override
    public IPrestamoHandler next() {
        return next;
    }
}
