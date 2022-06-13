package ejercicio5.exercise;


import java.util.HashMap;
import java.util.Map;

public class Github {
    private Map<String, Commit> stateMap = new HashMap<>();

    private RepositorioNotificaciones repositorioNotificaciones;

    public Github(RepositorioNotificaciones repositorioNotificaciones) {
        this.repositorioNotificaciones = repositorioNotificaciones;
    }

    public void push(String commitHash, Commit commit) {
        // it save a clone of the commit to avoid side effects
        stateMap.put(commitHash, commit.clone());
    }

    public Commit restoreCommit(String commitHash) {
        repositorioNotificaciones.send("Se ha resturado el commit: " + commitHash);
        return stateMap.get(commitHash);
    }


}
