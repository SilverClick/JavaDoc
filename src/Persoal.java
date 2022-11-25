public class Persoal {
    /**
     * Persoal.
     *
     * @author Gonzalo Arca
     * @version1.1
     */


        /*Declaramos los atributos correo
        y telefono
        */
        private String telefono;
        private String correo;

        /*
        Declaramos el constructor por defecto
        */
        public Persoal(){
        }
        /*
        Constructor.
        @param telefono
        @param correo
        */
        public Persoal(String telefono, String correo){
            this.telefono=telefono;
            this.correo=correo;

        }
        /*
        Setter:
        Dar valor correo
        */
        public void setValorCorreo(String correo){
            this.correo=correo;
        }
        /*
        Getter:
        @return correo
        */
        public String getValorCorreo(){
            return correo;
        }
        /*
       Setter:
         Dar valor telefono
         */
        public void setTelefono(String telefono){
            this.telefono=telefono;
        }
        /*
        Getter:
        @return telefono
        */
        public String getTelefono(){
            return telefono;
        }

        /*
         To string:
         @return telefono+correo
         */
        @Override
        public String toString(){
            return " telefono="+telefono+" correo="+correo;
        }
    }

