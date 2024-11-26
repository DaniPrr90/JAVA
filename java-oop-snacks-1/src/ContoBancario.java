public class ContoBancario {


    
    // ? Creo gli attributi 

    private  String numeroDiConto;
    private  double  saldo;

    //! creo il costruttore

    public ContoBancario (String numeroDiConto) {
this.numeroDiConto = numeroDiConto;
this.saldo = 0.0; // definisco il numero di saldo che parte da 0----
  }

  //! creo un metodo con le condizionali per depositare sul conto 

  public void deposita(double importo) {
    if (importo > 0) {
        saldo += importo;
        System.out.println("Hai depositato: " + importo + " €. Saldo attuale: " + saldo + " €.");
    } else {
        System.out.println("Importo non valido.");
    }
}

 // Creo un metodo  con condizionaLI per prelevare denaro

 public void preleva(double importo) {
    if (importo > 0 && importo <= saldo) {
        saldo -= importo;
        System.out.println("Hai prelevato: " + importo + " €. Saldo rimanente: " + saldo + " €.");
    } else if (importo > saldo) {
        System.out.println("Non puoi prelevare, non hai un soldo Barbone!.");
    } else {
        System.out.println("Importo non valido.");
    }
}

 // Metodo per ottenere il saldo corrente

 public double getSaldo() {
    return saldo;
}
// Metodo main per testare la classe
public static void main(String[] args) {
    // Creazione di un conto bancario
    ContoBancario conto = new ContoBancario("1234567890");

    // Operazioni sul conto
    conto.deposita(1000.0);
    conto.preleva(100.0);
    conto.preleva(200.0);

    // Mostro il saldo attuale sul conto

    System.out.println("Saldo Attuale: " + conto.getSaldo() + " €.");
}

    }

