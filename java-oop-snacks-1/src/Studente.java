        public class Studente {
            
            // ! Attributi della classe

            private String nome;
            private String cognome;
            private int eta;
        
            // * Costruttore
            
            public Studente(String nome, String cognome, int eta) {
                this.nome = nome;
                this.cognome = cognome;
                this.eta = eta;
            }
        
            // !Metodo per restituire la stringa concatenata

            public String descrizione() {
                
                return nome + " " + cognome + ", " + eta + " anni";
            }
        
            //!Metodo main per testare la classe
            public static void main(String[] args) {

                // Creo l'oggetto di uno studente

                Studente studente = new Studente("Anselmo", "Bitta", 24);

                //? Stampo nel terminale

                System.out.println(studente.descrizione());
            }
        }
    




    