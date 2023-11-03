import java.util.*;

public class Usuario {
        private int id;
        int puntuacion_juegos []; //(id, puntuacion)
        private PartidaActual partidaActual;
        private int nivel_actual;
        String[] juegos_jugados;
        private boolean partida_activa;

    public Usuario(int id, int puntuacion_juegos[], PartidaActual partidaActual, int nivel_actual, String[] juegos_jugados) {
            this.id = id;
            this.nivel_actual = nivel_actual;
            this.puntuacion_juegos = puntuacion_juegos;
            this.juegos_jugados = juegos_jugados;
            this.partida_activa = false;
    }

        public int getId() {
            return id;
        }
        public PartidaActual getPartidaActual(PartidaActual partidaActual) {
            return this.partidaActual;
        }
        public void setPartidaActual(PartidaActual partidaActual){
            this.partidaActual = partidaActual;
        }
        public int getNivelActual(){return nivel_actual;}
        public int getPuntuacion(int id_juego) {
            int puntuacion=0;
            for(int i=0;i<puntuacion_juegos.length;i++){
                if(puntuacion_juegos[i] == id_juego){
                    puntuacion = puntuacion_juegos[i+1];
                }
            }
            return puntuacion;
        }
        public boolean getPartidaActiva(){return partida_activa;}
        public String[] getPartidasJugadas (){
            return juegos_jugados;
        }
        public void setPartidaActiva(){partida_activa = true;}
        public void IniciarPartida(){}
}

