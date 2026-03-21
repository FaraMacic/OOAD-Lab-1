import java.util.Scanner;

public class Main {
    // Funkcija koja provjerava da li je broj prost
    public static boolean DaLiJeProst(int n) {
        if (n < 2) return false; // Brojevi manji od 2 nisu prosti
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Ako je djeljiv s nekim brojem, nije prost
        }
        return true; // Inače jeste prost
    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("eRNAD2222:");
            System.out.println("Amila");
            n = unos.nextInt();

            if (n > 500) {
                System.out.println("Uneseni broj je prevelik!");
            } else if (n < 2) {
                System.out.println("Nije moguće izvršiti izračunavanje prostih brojeva.");
                return; // prekida rad programa
            } else {
                // Ako je unos ispravan, izlazi se iz petlje
                break;
            }
        }

        // Ispis prostih brojeva između 2 i 2*n
        System.out.println("Prosti brojevi između 2 i " + (2 * n) + " su:");
        for (int i = 2; i <= 2 * n; i++) {
            if (DaLiJeProst(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}