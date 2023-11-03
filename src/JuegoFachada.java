import java.util.List;

public interface JuegoFachada {
    //Creacion de un juego (id, descripcion, numero de niveles)
    Juego crearJuego(int id_juego, String descripcion, int num_niveles);

    //Iniciar partida (
    void iniciarPartida(int JuegoID, int UsuarioID);

    //Consultar nivel actual
    int consultarNivel(int UsuarioID);

    //Consultar puntuacion actual
    int consultarPuntuacion(int UsuarioID);

    //Pasar de nivel
    void PasarDeNivel(Juego juego);

    //Finalizar partida
    void finalizarJuego(Juego juego);

    //Consulta de usuarios que han participado en un juego ordenado
    //por puntuacion (descendente)
    List<Usuario> ConsultaUsuarios(int JuegoID);

    //Consulta de las partidas en las que ha participado un usuario
    List<Juego> ConsultaPartidas(int UsuarioID);

}
