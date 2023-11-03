import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Juego {
    private int id;
    private String descripcion;
    private int num_niveles;


    List<Usuario> usuarios;

    public Juego(int id, String descripcion, int num_niveles) {
        this.id = id;
        this.descripcion = descripcion;
        this.num_niveles = num_niveles;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getNum_niveles(){
        return num_niveles;
    }
    public List<Usuario> GetUsuarios() {
        return usuarios;
        /*
        ArrayList <Usuario> GetUsuario = new ArrayList<>(this.usuarios);
        GetUsuario.sort(Comparator.comparing(Usuario::getPuntuacion));
        return GetUsuario;

         */
    }


}
