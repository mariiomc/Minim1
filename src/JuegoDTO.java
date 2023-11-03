import java.util.List;

public class JuegoDTO {
        private int id;
        private String descripcion;
        private int num_niveles;
        List<Usuario> usuarios;
        public void setId(int id){
            this.id = id;
        }
        public void setDescripcion(String descripcion){
            this.descripcion = descripcion;
        }
        public void setNumeroNiveles(int num_niveles){
            this.num_niveles = num_niveles;
        }
        public void setUsuarios(List<Usuario> usuarios){
            this.usuarios = usuarios;
        }
        private JuegoDTO convertirAJuegoDTO(Juego juego) {
            JuegoDTO juegoDTO = new JuegoDTO();
            juegoDTO.setId(juego.getId());
            juegoDTO.setDescripcion(juego.getDescripcion());
            juegoDTO.setNumeroNiveles(juego.getNum_niveles());
            juegoDTO.setUsuarios(juego.GetUsuarios());
            return juegoDTO;
        }
    }

