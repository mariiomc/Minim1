import java.util.Date;
import java.util.List;

public class PartidaActual {
    private String JugadorID;
    private String JuegoID;
    private int nivel_actual;
    private int puntuacion;
    private Date fecha;


    public PartidaActual(String JugadorID, String JuegoID, int nivel_actual, int puntuacion) {
        this.JuegoID=JuegoID;
        this.JugadorID=JugadorID;
        this.nivel_actual = nivel_actual;
        this.puntuacion=puntuacion;
    }
    public int getPuntuacion(){return puntuacion;}
    public void setPuntuacion(int puntuacion){this.puntuacion = puntuacion;}
    public int getNivelActual(){return nivel_actual;}
    public void setNivelActual(int nivelActual){this.nivel_actual = nivelActual;}
    public String getJugadorID(){return JugadorID;}
    public void setJugadorID(String JugadorID){this.JugadorID = JugadorID;}
    public String getJuegoID(){return JuegoID;}
    public void setJuegoID(String JuegoID){this.JuegoID = JuegoID;}
}
