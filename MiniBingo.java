import java.util.Random;
import java.util.Scanner;

public class MiniBingo {
    public static void main(){
        Scanner skener = new Scanner(System.in);

        System.out.println("--- DOBRODOŠLI U JAVA BINGO ---");

        int[] mojiBrojevi = unesiListic(skener);
        int[] dobitniBrojevi = generisiIzvlacenje(); // Poziva ispravljenu verziju bez duplikata

        prikaziRezultate(mojiBrojevi, dobitniBrojevi);

        int brojPogodaka = izbrojiPogotke(mojiBrojevi, dobitniBrojevi);

        ispisiNagradu(brojPogodaka);
    }

    public static int[] unesiListic(Scanner skener) {
        int[] listic = new int[6];
        System.out.println("Unesite vaših 6 brojeva (od 1 do 45):");

        for (int i = 0; i < listic.length; i++) {
            int broj;

            // Ova petlja se vrti sve dok korisnik ne unese ispravan broj
            while (true) {
                System.out.print("Broj " + (i + 1) + ": ");
                broj = skener.nextInt();

                if (broj >= 1 && broj <= 45) {
                    listic[i] = broj;
                    break; // Broj je dobar, izlazi iz while petlje i ide na sledeći broj u nizu
                } else {
                    System.out.println("Greška! Broj mora biti između 1 i 45. Pokušajte ponovo.");
                }
            }
        }
        return listic;
    }

    // POBOLJŠANA VERZIJA: Generiše 6 UNIKATNIH brojeva
    public static int[] generisiIzvlacenje() {
        Random rand = new Random();
        int[] izvuceni = new int[6];
        int trenutnoIzvuceno = 0;

        while (trenutnoIzvuceno < 6) {
            int potencijalniBroj = rand.nextInt(45) + 1;
            boolean vecPostoji = false;

            for (int i = 0; i < trenutnoIzvuceno; i++) {
                if (izvuceni[i] == potencijalniBroj) {
                    vecPostoji = true;
                    break;
                }
            }

            if (!vecPostoji) {
                izvuceni[trenutnoIzvuceno] = potencijalniBroj;
                trenutnoIzvuceno++;
            }
        }
        return izvuceni;
    }

    public static int izbrojiPogotke(int[] moji, int[] dobitni) {
        int brojac = 0;
        for (int i = 0; i < moji.length; i++) {
            for (int j = 0; j < dobitni.length; j++) {
                if (moji[i] == dobitni[j]) {
                    brojac++;
                    break;
                }
            }
        }
        return brojac;
    }

    public static void prikaziRezultate(int[] moji, int[] dobitni) {
        System.out.println("\nVaš listić: ");
        zaSvakiIspisi(moji); // Spojen naziv
        System.out.println("\nIzvučeni brojevi: ");
        zaSvakiIspisi(dobitni); // Spojen naziv
        System.out.println("\n---------------------------");
    }

    // Naziv metode mora biti jedna reč bez razmaka
    public static void zaSvakiIspisi(int[] niz) {
        for (int broj : niz) {
            System.out.print(broj + " ");
        }
    }

    public static void ispisiNagradu(int pogodaka) {
        System.out.println("Imate ukupno pogodaka: " + pogodaka);

        switch (pogodaka) {
            case 6:
                System.out.println("BINGO! Osvojili ste džekpot! 💰");
                break;
            case 5:
                System.out.println("Skoro! Osvojili ste letovanje! 🏖️");
                break;
            case 4:
                System.out.println("Odlično! Imate besplatnu večeru. 🍕");
                break;
            case 0:
                System.out.println("Više sreće drugi put, nula pogodaka. 😢");
                break;
            default:
                System.out.println("Nije loše, ali nedovoljno za nagradu. ❌");
                break;
        }
    } // Zatvorena zagrada za ispisiNagradu
} // Zatvorena zagrada za celu klasu







