import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Juego {
    private String id;
    private String descripcion;
    private int num_niveles;
    List<Usuario> usuarios;

    public Juego(String id, String descripcion, int num_niveles) {
        this.id = id;
        this.descripcion = descripcion;
        this.num_niveles = num_niveles;
    }

    public String getId() {
        return id;
    }
    public void setId(String JuegoID){this.id = JuegoID;}

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public int getNumNiveles(){
        return num_niveles;
    }
    public void setNumNiveles(int numNiveles){this.num_niveles = numNiveles;}
    public List<Usuario> GetUsuarios() {
        return usuarios;
    }
    public void setUsuarios(List<Usuario> usuario){this.usuarios = usuario;}

}