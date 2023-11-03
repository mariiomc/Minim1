import java.util.Date;
import java.util.List;

public class PartidaActual {
    private int JugadorID;
    private int JuegoID;
    private int nivel_actual;
    private int puntuacion;
    private boolean PasarNivel;
    private Date fecha;


    public PartidaActual(int JugadorID, int JuegoID, int nivel_actual, int puntuacion, boolean PasarNivel) {
        this.JuegoID=JuegoID;
        this.JugadorID=JugadorID;
        this.nivel_actual = nivel_actual;
        this.puntuacion=puntuacion;
        this.PasarNivel=PasarNivel;
    }

    public int getPuntuacion(){
        return puntuacion;
    }
    public int getNivelActual(){
        return nivel_actual;
    }
    public int getJugadorID(){return JugadorID;}
    public int getJuegoID(){return JuegoID;}
    public void setNivelActual(int nivel){this.nivel_actual = nivel;}

}
