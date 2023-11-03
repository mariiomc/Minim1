public class JuegoManager {

    public void crearJuego(int juegoID, String descripcion,int numNiveles){
        Juego juego = new Juego(juegoID, descripcion, numNiveles);
    }
    public void iniciarPartida(int usuarioID, int juegoID) {
        PartidaActual nuevaPartida = new PartidaActual(usuarioID, juegoID, 1, 50, false);
        Usuario.setPartidaActual(nuevaPartida);
        nuevaPartida.setNivelActual(1); // Actualizar el nivel actual del usuario
        Usuario.setPartidaActiva(); // Marcar la partida como activa
    }

    public String consultarNivel(int usuarioID){
        int nivel_actual;
        int juegoID;
        String mensaje;
        if(PartidaActual.getJugadorID == usuarioID){
            nivel_actual= PartidaActual.getNivelActual;
            juegoID = PartidaActual.getJuegoID;
        }
        String nivel = String.valueOf(nivel_actual);
        String juego = String.valueOf(juegoID);

        mensaje += ("Nivel actua: "+ nivel + "Juego: " + juego);
        return mensaje;
    }

    public int consultarPuntuacion(int usuarioID){
        int puntuacion;
        if(PartidaActual.getJugadorID == usuarioID){
            puntuacion= PartidaActual.getNivelActual;
        }
        return puntuacion;
    }
}
