public class Conto {
    private String cf, iban;
    private double saldo;

    public Conto(String cf, String iban) {
        this.cf = cf;
        this.iban = iban;
        this.saldo = 0;
    }

    public void prelievo(double p){
        if(p<this.saldo){
            this.saldo-=p;
        }
        else{
            System.out.println("Transazione di "+p+" negata a "+iban);
        }
    }

    public void depodita(double d){

            this.saldo+=d;
    }


    public String getIban() {
        return this.iban;
    }

    public String getCf() {
        return this.cf;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString(){
        return ("IBAN: "+ iban +" Codice fiscale: "+cf+" SALDO: " + saldo );
    }
}
