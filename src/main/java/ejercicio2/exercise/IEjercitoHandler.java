package ejercicio2.exercise;

public interface IEjercitoHandler {
    void setNext(IEjercitoHandler handler);
    void criteriaHandler(Orden orden);
    IEjercitoHandler next();
}
