package ejercicio5.exercise;

import java.util.ArrayList;
import java.util.List;

public class Git {
    private List<Codigo> listaCodigo = new ArrayList<>();

    public void gitAdd(Codigo state){
        this.listaCodigo.add(state);
    }

    public Commit createCommit(){
        return new Commit(listaCodigo);
    }

    public List<Codigo> restoreCommit(Commit commit){
        this.listaCodigo= commit.getState();
        return this.listaCodigo;
    }

}
