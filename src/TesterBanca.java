import java.util.Arrays;

public class TesterBanca {
    public static void main(String[] args) {
        Banca b = new Banca(10, "NuovaBanca");

        b.aggiungiConto("CF1");
        b.aggiungiConto("CF2");
        b.aggiungiConto("CF3");
        b.aggiungiConto("CF4");

        System.out.println(b.transazione("deposita", "ITA0001", 500));
        System.out.println(b.transazione("deposita", "ITA0002", 500));
        System.out.println(b.transazione("deposita", "ITA0003", 500));
        System.out.println(b.transazione("preleva", "ITA0001", 300));
        System.out.println(b.transazione("preleva", "ITA0001", 300));
        System.out.println(b.transazione("deposita", "ITA0005", 300));
        System.out.println(Arrays.toString(b.getConto()));
    }
}
