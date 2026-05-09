# 🎰 Java MiniBingo Simulator

Ovaj projekat je konzolna aplikacija pisana u Javi koja simulira igru Bingo. Fokus projekta je na primeni osnovnih programerskih koncepata, kontroli toka i validaciji korisničkog unosa.

## 🚀 Ključne Karakteristike

*   **Validacija podataka (Input Validation):** Implementirana `while` petlja koja sprečava korisnika da unese brojeve van opsega (1-45).
*   **Logika unikatnosti:** Algoritam osigurava da računar nikada ne izvuče dva ista broja u jednom krugu.
*   **Efikasna pretraga:** Korišćenje ugnježdenih petlji za poređenje korisničkih i dobitnih brojeva.
*   **Modularni kod:** Kod je organizovan u metode radi bolje čitljivosti i lakšeg održavanja (Clean Code principi).

## 🛠 Tehnologije
*   **Jezik:** Java
*   **Klase:** `Scanner` (za unos), `Random` (za generisanje brojeva)
*   **Strukture:** Nizovi (`arrays`), `for-each` petlje, `switch-case` selekcija.

## 📋 Kako testirati aplikaciju (QA perspektiva)
Kao neko ko se bavi QA testiranjem, ovaj kod sam dizajnirala tako da pokrije:
1.  **Happy Path:** Korisnik unosi 6 validnih brojeva.
2.  **Boundary Testing:** Testiranje unosa brojeva 1 i 45.
3.  **Negative Testing:** Provera kako sistem reaguje na brojeve van opsega (npr. 0 ili 49).

## 💻 Pokretanje
1. Klonirajte repozitorijum:
   ```bash
   git clone git@github.com:Kassandra1994/Java-bingo-simulator.git
2. Kompajlirajte i pokrenite:

```bash
javac MiniBingo.java
java MiniBingo
