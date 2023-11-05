import java.util.*;

public class Usuario {
    private String id;
    private PartidaActual partidaActual;
    private int puntuacion;

    public Usuario(String id, PartidaActual partidaActual, int puntuacion) {
        this.id = id;
        this.partidaActual = partidaActual;
        this.puntuacion = puntuacion;
    }

    public String getId() {return id;}
    public void setId(String id){this.id = id;}
    public PartidaActual getPartidaActual(){return partidaActual;}
    public void setPartidaActual(PartidaActual partidaActual){this.partidaActual = partidaActual;}
    public int getPuntuacion(){return puntuacion;}
    public void setPuntuacion(int puntuacion){this.puntuacion=puntuacion;}


}

