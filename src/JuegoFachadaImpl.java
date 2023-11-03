import java.util.List;
import java.util.logging.Logger;
public class JuegoFachadaImpl implements JuegoFachada{
    private static JuegoFachadaImpl instance;
    private static final Logger logger = Logger.getLogger(String.valueOf(JuegoFachadaImpl.class));
    private JuegoFachadaImpl() {
    }
    public static JuegoFachadaImpl getInstance() {
        if (instance == null) {
            instance = new JuegoFachadaImpl();
        }
        return instance;
    }
    private List<Juego> juegos;
    private List<Usuario> usuarios;
    int id_partida;
    int id_usuario;
    private boolean existeJuego(int juegoID){
        for (Juego juego : juegos) {
            if (juego.getId() == juegoID) {
                return true; // El juego existe.
            }
        }
        return false; // El juego no existe.
    }
    private boolean existeUsuario(int usuarioID) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == usuarioID) {
                return true; // El usuario existe.
            }
        }
        return false; // El usuario no existe.
    }
    private boolean partidaActiva(int usuarioID){
        for (Usuario usuario : usuarios){
            if(usuario.getPartidaActiva()){
                id_usuario=usuario.getId();
                id_partida = usuario.getIdPartida();
                return true;
            }
        }
        return false;
    }
    public Juego crearJuego(int JugadorID, String descripcion, int num_niveles) {
        logger.info("Método crearJuego - Parámetros: ID del jugador= " + JugadorID + ", Descrpcion= " + descripcion + ", Numero de niveles= " + num_niveles);
        return null;
    }
    public void iniciarPartida(int juegoID, int UsuarioID){
        if(!existeJuego(juegoID)){
            logger.info("Método iniciarPartida: NO EXISTE EL JUEGO");
            return;
        }
        else if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO");
            return;
        }
        else if(!partidaActiva(UsuarioID)){

            logger.info("Método iniciarPartida: " + id_usuario+ " inicia el juego "+ id_partida);
        }
        else {
            logger.info("Método iniciarPartida - Parámetros: Id del juego: " + juegoID + ", Id del usuario: " + UsuarioID);
        }
    }

    public int consultarNivel (int UsuarioID){
        if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO!");
            return 0;
        }
        else {
            logger.info("Método consultarNivel - Parámetros: Id del usuario: " + UsuarioID);
            return 0;
        }
    }

    public int consultarPuntuacion(int UsuarioID){
        if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO!");
            return 0;
        }
        else {
            logger.info("Método consultarPuntuacion - Parámetros: Id del usuario: " + UsuarioID);
            return 0;
        }
    }

    @Override
    public void PasarDeNivel(Juego juego) {

    }

    @Override
    public void finalizarJuego(Juego juego) {

    }

    public void PasarDeNivel(PartidaActual partidaActual){
        if(!existeUsuario(partidaActual.getJugadorID())){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO O NO ESTÁ EN PARTIDA");
            return;
        }
        else {
            logger.info("Método consultarPuntuacion - Parámetros: Partida Actual: " + partidaActual);
        }
    }

    public void finalizarJuego(PartidaActual partidaActual){
        if(!existeUsuario(partidaActual.getJugadorID())){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO O NO ESTÁ EN PARTIDA");
            return;
        }
        else {
            logger.info("Método consultarPuntuacion - Parámetros: Juego: " + partidaActual);
        }
    }

    public List<Usuario> ConsultaUsuarios(int JuegoID){
        if(!existeJuego(JuegoID)){
            logger.info("Método iniciarPartida: NO EXISTE EL JUEGO");
            return null;
        }
        else {
            logger.info("Método consultarPuntuacion - Parámetros: Juego: " + JuegoID);
            return null;
        }
    }

    public List<Juego> ConsultaPartidas(int UsuarioID){
        if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO O NO ESTÁ EN PARTIDA");
            return null;
        }
        else{
            logger.info("Método consultarPuntuacion - Parámetros: Juego: " + UsuarioID);
            return null;
        }
    }






}
