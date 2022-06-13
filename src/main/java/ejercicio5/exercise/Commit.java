package ejercicio5.exercise;

import java.util.ArrayList;
import java.util.List;

public class Commit implements IPrototype{ //Memento
    private List<Codigo> state = new ArrayList<>();

    public Commit(List<Codigo> codigo){
        state= codigo;
    }

    public List<Codigo> getState() {
        return state;
    }

    @Override
    public Commit clone() {
        List<Codigo> listaClonada = new ArrayList<>();
        for (Codigo codigo : state) {
            listaClonada.add(codigo.clone());
        }
        return new Commit(listaClonada);
    }
}
