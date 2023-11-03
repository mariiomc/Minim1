public class JuegoDTO {
        private int id;
        private String descripcion;
        private int num_niveles;
        public void setId(int id){
            this.id = id;
        }
        public void setEstado(String descripcion){

        }
        private JuegoDTO convertirAJuegoDTO(Juego juego) {
            JuegoDTO juegoDTO = new JuegoDTO();
            juegoDTO.setId(juego.getId());
            juegoDTO.setNumeroEquipos(juego.getNumeroEquipos());
            juegoDTO.setDimensionEquipos(juego.getDimensionEquipos());
            return juegoDTO;
        }
    }

