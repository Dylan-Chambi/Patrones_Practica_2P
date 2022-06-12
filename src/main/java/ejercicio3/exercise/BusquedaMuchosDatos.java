package ejercicio3.exercise;

public class BusquedaMuchosDatos implements IStrategy{


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
        int left = 0, right = sortedCelularesList.getListaCelularesPrecio().size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            int comparision = Integer.compare(precio, sortedCelularesList.getListaCelularesPrecio().get(mid).getPrecio());
            if (comparision == 0) {
                System.out.println("Se encontro el celular " + sortedCelularesList.getListaCelularesPrecio().get(mid).getInfo());
                buscarAlrededorPrecio(sortedCelularesList, mid, precio);
                return;
            }
            if (comparision > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    @Override
    public void buscarCelularModelo(SortedCelularesList sortedCelularesList, String modelo) {
        int left = 0, right = sortedCelularesList.getListaCelularesModelo().size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            int comparision = modelo.compareTo(sortedCelularesList.getListaCelularesModelo().get(mid).getModelo());
            if (comparision == 0) {
                System.out.println("Se encontro el celular " + sortedCelularesList.getListaCelularesModelo().get(mid).getInfo());
                buscarAlrededorModelo(sortedCelularesList, mid, modelo);
                return;
            }
            if (comparision > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    public void buscarAlrededorModelo(SortedCelularesList sortedCelularesList, int index, String modelo){
        int indexLeft = index - 1;
        while(indexLeft >= 0 && sortedCelularesList.getListaCelularesModelo().get(indexLeft).getModelo().equals(modelo)){
            System.out.println("Se encontro el celular " + sortedCelularesList.getListaCelularesModelo().get(indexLeft).getInfo());
            indexLeft--;
        }

        int indexRight = index + 1;
        while(indexRight < sortedCelularesList.getListaCelularesPrecio().size() && sortedCelularesList.getListaCelularesModelo().get(indexRight).getModelo().equals(modelo)){
            System.out.println("Se encontro el celular " + sortedCelularesList.getListaCelularesModelo().get(indexRight).getInfo());
            indexRight++;
        }
    }

    public void buscarAlrededorPrecio(SortedCelularesList sortedCelularesList, int index, int precio){
        int indexLeft = index - 1;
        while(indexLeft >= 0 && sortedCelularesList.getListaCelularesPrecio().get(indexLeft).getPrecio() == precio){
            System.out.println("Se encontro el celular modelo " + sortedCelularesList.getListaCelularesModelo().get(indexLeft).getModelo() + " y precio: " + precio);
            indexLeft--;
        }

        int indexRight = index + 1;
        while(indexRight < sortedCelularesList.getListaCelularesPrecio().size() && sortedCelularesList.getListaCelularesModelo().get(indexRight).getPrecio() == precio){
            System.out.println("Se encontro el celular modelo " + sortedCelularesList.getListaCelularesModelo().get(indexRight).getModelo() + " y precio: " + precio);
            indexRight++;
        }
    }

}
