import java.util.Date;
import java.util.List;

public interface JuegoFachada {
    public void crearJuego(String JuegoId, String descripcion, int num_niveles);
    public void iniciarPartida(String JuegoID, String UsuarioID);
    public int consultarNivel(String UsuarioID);
    public int consultarPuntuacion(String UsuarioID);
    public void PasarDeNivel(String UsuarioID, int puntos, Date fecha);
    public void finalizarJuego(String UsuarioID);
    public List<Usuario> ConsultaUsuarios(String JuegoID);
    public List<Juego> ConsultaPartidas(String UsuarioID);
}
