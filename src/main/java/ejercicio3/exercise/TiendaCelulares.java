package ejercicio3.exercise;

public class TiendaCelulares {
    private SortedCelularesList listaCelulares;
    private IStrategy strategy;

    public TiendaCelulares() {
        this.listaCelulares = new SortedCelularesList();
    }

    public void addCelular(Celular celular){
        listaCelulares.add(celular);
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }


    public void buscarCelularPrecioyModelo(String modelo, int precio) {
        strategy.buscarCelularPrecioyModelo(listaCelulares, modelo, precio);
    }

    public void buscarCelularPrecio(int precio) {
        strategy.buscarCelularPrecio(listaCelulares, precio);
    }

    public void buscarCelularModelo(String modelo) {
        strategy.buscarCelularModelo(listaCelulares, modelo);
    }


}
