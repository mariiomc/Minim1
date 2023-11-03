import java.util.*;

public class Usuario {
        private int id;
        List<Juego> puntuacion_juegos; //(id del juego, puntuacion)
        private PartidaActual partidaActual;
        private String nivel_actual;
        String[] juegos_jugados;
        private boolean partida_activa;

    public Usuario(int id, List<Juego> puntuacion_juegos, PartidaActual partidaActual, String nivel_actual, String[] juegos_jugados) {
            this.id = id;
            this.nivel_actual = nivel_actual;
            this.puntuacion_juegos = puntuacion_juegos;
            this.juegos_jugados = juegos_jugados;
            this.partida_activa = false;
    }

        // Getters y setters
        public int getId() {
            return id;
        }

        public PartidaActual getPartidaActual() {
            return partidaActual;
        }
        public void setPartidaActual(PartidaActual partidaActual){
            this.partidaActual = partidaActual;
        }
        public String getNivelActual(){return nivel_actual;}
        public int getPuntuacion(int id_juego) {
            return puntuacion_juegos.lastIndexOf(id_juego);
        }
        public boolean getPartidaActiva(){return partida_activa;}
        public String[] getPartidasJugadas (){
            return juegos_jugados;
        }
        public void setPartidaActiva(){partida_activa = true;}
        public void IniciarPartida(){}
}

