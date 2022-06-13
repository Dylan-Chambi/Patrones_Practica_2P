package ejercicio7.exercise;

public interface IPrestamoHandler {
    void setNext(IPrestamoHandler handler);
    void criteriaHandler(Prestamo prestamo);
    IPrestamoHandler next();
}
