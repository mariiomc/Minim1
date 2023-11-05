import java.util.Date;
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
    private boolean existeJuego(String juegoID){
        for (Juego juego : juegos) {
            if (juego.getId() == juegoID) {
                return true; // El juego existe.
            }
        }
        return false; // El juego no existe.
    }
    private boolean existeUsuario(String usuarioID) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == usuarioID) {
                return true; // El usuario existe.
            }
        }
        return false; // El usuario no existe.
    }
    public int crearJuego(String JugadorID, String descripcion, int num_niveles) {
        logger.info("Método crearJuego - Parámetros: ID del jugador= " + JugadorID + ", Descrpcion= " + descripcion + ", Numero de niveles= " + num_niveles);
        return 0;
    }
    public void iniciarPartida(String juegoID, String UsuarioID){
        if(!existeJuego(juegoID)){
            logger.info("Método iniciarPartida: NO EXISTE EL JUEGO");
            return;
        }
        else if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO");
            return;
        }
        else {
            logger.info("Método iniciarPartida - Parámetros: Id del juego: " + juegoID + ", Id del usuario: " + UsuarioID);
        }
    }

    public int consultarNivel (String UsuarioID){
        if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO!");
            return 0;
        }
        else {
            logger.info("Método consultarNivel - Parámetros: Id del usuario: " + UsuarioID);
            return 0;
        }
    }

    public int consultarPuntuacion(String UsuarioID){
        if(!existeUsuario(UsuarioID)){
            logger.info("Método consultarPuntuacion: NO EXISTE EL USUARIO!");
            return 0;
        }
        else {
            logger.info("Método consultarPuntuacion - Parámetros: Id del usuario: " + UsuarioID);
            return 0;
        }
    }
    public void finalizarJuego(String UsuarioID) {
        if(!existeUsuario(UsuarioID)){
            logger.info("Método consultarPuntuacion: NO EXISTE EL USUARIO!");
            return;
        }
        else {
            logger.info("Método consultarPuntuacion - Parámetros: Id del usuario: " + UsuarioID);
            return;
        }
    }
    public void PasarDeNivel(String UsuarioID, int puntos, Date fecha){
        if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO O NO ESTÁ EN PARTIDA");
            return;
        }
        else{
            logger.info("Método consultarPuntuacion - Parámetros: Usuario: " + UsuarioID + ", puntos: "+ puntos + ", fecha: "+ fecha);
            return;
        }
    }


    public List<Usuario> ConsultaUsuarios(String JuegoID){
        if(!existeJuego(JuegoID)){
            logger.info("Método iniciarPartida: NO EXISTE EL JUEGO");
        }
        else {
            logger.info("Método consultarPuntuacion - Parámetros: Juego: " + JuegoID);
        }
    }

    public List<Juego> ConsultaPartidas(String UsuarioID){
        if(!existeUsuario(UsuarioID)){
            logger.info("Método iniciarPartida: NO EXISTE EL USUARIO O NO ESTÁ EN PARTIDA");
            return;
        }
        else{
            logger.info("Método consultarPuntuacion - Parámetros: Juego: " + UsuarioID);
            return;
        }
    }






}
