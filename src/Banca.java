import java.util.Objects;
import java.util.Arrays;

public class Banca  {

    private Conto[] conto;
    private int contatore;
    private int nmax;
    private String nome;


    public Banca(int nmax, String nome) {
        this.conto = new Conto[nmax];
        this.contatore = 0;
        this.nmax = nmax;
        this.nome = nome;
    }

    public void aggiungiConto(String cf){
        String iban = ("ITA000"+(contatore+1));
        this.conto[this.contatore]= new Conto(cf, iban);
        this.contatore++;
    }

    public Conto transazione(String tra,String iban, double importo){

        for(int i=0; i<contatore; i++){

            if(conto[i].getIban().equals(iban)){
                if(tra.equals("deposita")){
                    conto[i].depodita(importo);
                    return conto[i];
                }
                else if(tra.equals("preleva")){
                    conto[i].prelievo(importo);
                    return conto[i];
                }

            }

        }
        System.out.println(iban+" Conto non trovato");
        return null;
    }

    public Conto[] getConto() {
        return conto;
    }

    public String toString() {
        for (int i = 0; i < contatore; i++) {
            return ("IBAN: " + conto[i].getIban() +" Codice fiscale; "+conto[i].getCf()+ " SALDO: " + conto[i].getSaldo());

        }
        return null;
    }
}


