package ejercicio7.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Banco {
    private static Banco instance;
    private static ManagerPrestamoHandler managerHandler;
    private HashMap<String, ArrayList<Prestamo>> prestamos;


    private Banco(){
        prestamos = new HashMap<String, ArrayList<Prestamo>>();
        managerHandler = new ManagerPrestamoHandler();
    }
    private synchronized static void  multiThreadControl(){
        if (instance== null)
            instance= new Banco();
    }

    public static Banco getInstance(){
        if (instance== null)
            multiThreadControl();

        return instance;
    }

    public synchronized void prestarse(Prestamo prestamo){
        boolean puedePrestarse = true;
        double deudaRestante = 0;
        if(prestamos.get(prestamo.getNombre()) != null) {
            for (Prestamo prestamosAnteriores : prestamos.get(prestamo.getNombre())) {
                deudaRestante += prestamosAnteriores.getPrestamoRestante();
                if (!prestamosAnteriores.isPuedePrestarse()) {
                    puedePrestarse = false;
                    break;
                }
            }

            if (puedePrestarse) {
                prestamos.get(prestamo.getNombre()).add(prestamo);
                System.out.println(prestamo.getNombre() + " pidio al banco un prestamo de " + prestamo.getPrestamoTotal() + " y tiene una deuda previa de " + deudaRestante);
            }else{
                System.out.println("El cliente " + prestamo.getNombre() + " no puede realizar mas prestamos, porque tiene una deuda de " + deudaRestante);
            }
        }else{
            ArrayList<Prestamo> prestamosCliente = new ArrayList<Prestamo>();
            prestamosCliente.add(prestamo);
            System.out.println(prestamo.getNombre() + " pidio al banco un prestamo de " + prestamo.getPrestamoTotal() + " y tiene una deuda previa de " + deudaRestante);
            prestamos.put(prestamo.getNombre(), prestamosCliente);
        }
    }

    public synchronized void pagarPrestamo(Prestamo prestamo, double montoPagado) {
        if(prestamos.get(prestamo.getNombre()).contains(prestamo)) {
            if(!prestamo.isPagoTerminado()) {
                if (montoPagado > 0) {
                    if (montoPagado <= prestamo.getPrestamoRestante()) {
                        prestamo.setPrestamoPagado(prestamo.getPrestamoPagado() + montoPagado);
                        prestamo.setPrestamoRestante(prestamo.getPrestamoRestante() - montoPagado);
                        System.out.println(prestamo.getNombre() + " hizo un pago de " + montoPagado + " y falta por pagar " + prestamo.getPrestamoRestante());
                    } else {
                        System.out.println(prestamo.getNombre() + " hizo un pago de " + montoPagado + " y le sobro " + (montoPagado - prestamo.getPrestamoRestante()));
                        prestamo.setPrestamoPagado(prestamo.getPrestamoTotal());
                        prestamo.setPrestamoRestante(0);
                    }
                    double porcentajeDePago = prestamo.getPrestamoPagado() / prestamo.getPrestamoTotal();
                    System.out.println("Porcentaje de pago: " + porcentajeDePago*100 + "%");
                    managerHandler.criteriaHandler(prestamo);
                } else {
                    System.out.println("No se puede pagar un monto negativo");
                }
            }else {
                System.out.println("El prestamo ya fue pagado");
            }
        }else{
            System.out.println("El cliente " + prestamo.getNombre() + " no tiene este prestamo");
        }
    }
}
