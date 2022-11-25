import javax.swing.JOptionPane;
public class Academica {

    /**
     * Académica.
     *
     * @author Gonzalo Arca
     * @version 1.1
     */


        /*
        Declaramos los atributos numReferencia=2018,
        el atributo nome,el atributo nota y
        el atributo alum.

        */
        public static int numReferencia=2018;
        private String nome;
        private int nota;
        private Persoal alum=new Persoal();

        /*
        Declaramos el constructor por defecto.
        */
        public Academica(){
            numReferencia ++;
        }
        /*
        Constructor:
        @param nome
        @param nota
        @param alum
        */
        public Academica(String nome, int nota, Persoal alum){ //constructor parametrizado
            Academica.numReferencia ++;
            this.alum=alum;
            this.nota=nota;
            this.nome=nome;

        }
        /*
        Setter:
        Dar valor nome
        */
        public void darValorNome(String nome){ //corresponde a setNome
            this.nome=nome;
        }
        /*
        Getter:
        @return nome
        */
        public String devolverValorNome(){ //equivale a getNome
            return nome;
        }
        /*
        Setter:
        Dar valor nota
        */
        public void setNota(int nota){
            this.nota=nota;
        }
        /*
        Getter:
        @return nota
        */
        public int getNota(){
            return nota;
        }
        /*
        Setter:
        Dar valor numReferencia
        */
        public static void setNumReferencia(int numReferencia){
            Academica.numReferencia=numReferencia;
        }
        /*
        Getter:
        @return numReferencia
        */
        public static int getNumReferencia(){
            return numReferencia;
        }


        /*
         To string:
         @return nota+nome+alum
         */

        public String toString(){
            return " nota="+nota+" Nome="+nome+"Alumno="+alum;
        }
        /*
         Definir metodo pedirEnteiro:
         Pedir nota entre 0 y 10 cuando se cumpla
         esa condicion.
         */
        public int pedirEnteiro(){
            do{
                nota=Integer.parseInt(JOptionPane.showInputDialog("teclea nota entre 0 e 10"));
            }
            while(nota<0 || nota>10);
            return nota;
        }

    }


