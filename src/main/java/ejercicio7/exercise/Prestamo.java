package ejercicio7.exercise;

public class Prestamo {
    private String nombre;
    private String numeroCuenta;
    private double prestamoTotal;
    private double prestamoPagado;

    private double prestamoRestante;

    private boolean puedePrestarse;
    private boolean pagoTerminado;


    public Prestamo(String nombre, String numeroCuenta, double prestamoTotal) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.prestamoTotal = prestamoTotal;
        this.prestamoPagado = 0;
        this.prestamoRestante = prestamoTotal;
        this.puedePrestarse = false;
        this.pagoTerminado = false;
    }

    public boolean isPagoTerminado() {
        return pagoTerminado;
    }

    public void setPagoTerminado(boolean pagoTerminado) {
        this.pagoTerminado = pagoTerminado;
    }

    public double getPrestamoRestante() {
        return prestamoRestante;
    }

    public void setPrestamoRestante(double prestamoRestante) {
        this.prestamoRestante = prestamoRestante;
    }

    public boolean isPuedePrestarse() {
        return puedePrestarse;
    }

    public void setPuedePrestarse(boolean puedePrestarse) {
        this.puedePrestarse = puedePrestarse;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getPrestamoTotal() {
        return prestamoTotal;
    }

    public void setPrestamoTotal(double prestamoTotal) {
        this.prestamoTotal = prestamoTotal;
    }

    public double getPrestamoPagado() {
        return prestamoPagado;
    }

    public void setPrestamoPagado(double prestamoPagado) {
        this.prestamoPagado = prestamoPagado;
    }
}
