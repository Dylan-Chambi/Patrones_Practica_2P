package ejercicio3.exercise;

import java.util.*;

public class SortedCelularesList{

    private List<Celular> listaCelularesModelo;
    private List<Celular> listaCelularesPrecio;

    public SortedCelularesList() {
        this.listaCelularesModelo = new ArrayList<>();
        this.listaCelularesPrecio = new ArrayList<>();
    }

    public List<Celular> getListaCelularesModelo() {
        return listaCelularesModelo;
    }

    public List<Celular> getListaCelularesPrecio() {
        return listaCelularesPrecio;
    }

    public void add(Celular celular){

        if(listaCelularesModelo.size() == 0){
            listaCelularesModelo.add(celular);
        }
        if(listaCelularesPrecio.size() == 0){
            listaCelularesPrecio.add(celular);
        }

        for (int i = 0; i < listaCelularesModelo.size(); i++) {
            int comparision = celular.getModelo().compareTo(listaCelularesModelo.get(i).getModelo());
            if(comparision > 0){

            }else if (comparision == 0){
                boolean comparision2 = celular.getPrecio() <= listaCelularesModelo.get(i).getPrecio();
                if(comparision2){
                    listaCelularesModelo.add(i, celular);
                    break;
                }
            }else {
                listaCelularesModelo.add(i, celular);
                break;
            }
            if(i == listaCelularesModelo.size()-1){
                listaCelularesModelo.add(celular);
                break;
            }
        }

        for (int i = 0; i < listaCelularesPrecio.size(); i++) {
            int comparision = Integer.compare(celular.getPrecio(), listaCelularesPrecio.get(i).getPrecio());

            if(comparision > 0){

            }else if (comparision == 0){
                boolean comparision2 = celular.getModelo().compareTo(listaCelularesPrecio.get(i).getModelo()) <= 0;
                if(comparision2){
                    listaCelularesPrecio.add(i, celular);
                    break;
                }
            }else {
                listaCelularesPrecio.add(i, celular);
                break;
            }
            if(i == listaCelularesPrecio.size()-1){
                listaCelularesPrecio.add(celular);
                break;
            }
        }
    }

    public Celular get(int index){
        return listaCelularesModelo.get(index);
    }

}
