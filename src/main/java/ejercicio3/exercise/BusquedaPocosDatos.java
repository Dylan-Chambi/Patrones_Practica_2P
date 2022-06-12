package ejercicio3.exercise;

public class BusquedaPocosDatos implements IStrategy{


    @Override
    public void buscarCelularPrecioyModelo(SortedCelularesList sortedCelularesList, String modelo, int precio) {
        for(Celular celular: sortedCelularesList.getListaCelularesModelo()){
            if(celular.getModelo().equals(modelo) && celular.getPrecio() == precio){
                System.out.println("Se encontro el celular " + celular.getInfo());
            }
        }

    }

    @Override
    public void buscarCelularPrecio(SortedCelularesList sortedCelularesList, int precio) {
        for (Celular celular : sortedCelularesList.getListaCelularesPrecio()) {
            if (celular.getPrecio() == precio) {
                System.out.println("Se encontro el celular modelo "+ celular.getInfo());;
            }
        }
    }

    @Override
    public void buscarCelularModelo(SortedCelularesList sortedCelularesList, String modelo) {
        for(Celular celular: sortedCelularesList.getListaCelularesModelo()){
            if(celular.getModelo().equals(modelo)){
                System.out.println("Se encontro el celular modelo "+ celular.getInfo());
            }
        }
    }

}
