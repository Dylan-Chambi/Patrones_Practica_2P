package ejercicio3.exercise;

public interface IStrategy {
    void buscarCelularPrecioyModelo(SortedCelularesList sortedCelularesList, String modelo, int precio);
    void buscarCelularPrecio(SortedCelularesList sortedCelularesList, int precio);

    void buscarCelularModelo(SortedCelularesList sortedCelularesList, String modelo);
}
