import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wypozyczalnia {

    static class Klient {
        String imie;
        String nazwisko;
        String telefon;

        Klient(String imie, String nazwisko, String telefon) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.telefon = telefon;
        }

        public String toString() {
            return imie + " " + nazwisko + ", tel. " + telefon;
        }
    }

    static List<Pojazd> pojazdy = new ArrayList<Pojazd>();
    static List<Klient> klienci = new ArrayList<Klient>();
    static Scanner sc = new Scanner(System.in);

    static void zaladujBaze() {

    }

    public static void main(String[] args) {
        zaladujBaze();
        boolean dziala = true;

        while (dziala) {
            System.out.println();
            System.out.println("1. Pojazdy  2. Dodaj pojazd  3. Usun pojazd");
            System.out.println("4. Klienci  5. Dodaj klienta  6. Usun klienta  0. Wyjscie");
            String wybor = wczytaj("Wybor: ");

            switch (wybor) {
                case "1":
                    pokazPojazdy();
                    break;
                case "2":
                    dodajPojazd();
                    break;
                case "3":
                    usunPojazd();
                    break;
                case "4":
                    pokazKlientow();
                    break;
                case "5":
                    dodajKlienta();
                    break;
                case "6":
                    usunKlienta();
                    break;
                case "0":
                    dziala = false;
                    break;
                default:
                    System.out.println("Zla opcja.");
            }
        }
        System.out.println("Do widzenia!");
    }

    static void pokazPojazdy() {
        if (pojazdy.isEmpty()) System.out.println("Brak pojazdow.");
        for (Pojazd p : pojazdy) System.out.println(p);
    }

    static void dodajPojazd() {
        String typ = wczytaj("1 - Samochod, 2 - Motocykl: ");
        if (!typ.equals("1") && !typ.equals("2")) {
            System.out.println("Zly typ.");
            return;
        }
        String marka = wczytaj("Marka: ");
        String model = wczytaj("Model: ");
        int cena = liczba("Cena za dzien: ");
        if (typ.equals("1")) {
            pojazdy.add(new Samochod(marka, model, cena, liczba("Liczba miejsc: ")));
        } else {
            pojazdy.add(new Motocykl(marka, model, cena, liczba("Pojemnosc (cm3): ")));
        }
        System.out.println("Dodano pojazd.");
    }

    static void usunPojazd() {
        pokazPojazdy();
        int id = liczba("ID pojazdu do usuniecia: ");
        for (int i = 0; i < pojazdy.size(); i++) {
            if (pojazdy.get(i).getId() == id) {
                pojazdy.remove(i);
                System.out.println("Usunieto pojazd.");
                return;
            }
        }
        System.out.println("Nie ma takiego pojazdu.");
    }

    static void pokazKlientow() {
        if (klienci.isEmpty()) System.out.println("Brak klientow.");
        for (int i = 0; i < klienci.size(); i++) {
            System.out.println((i + 1) + ". " + klienci.get(i));
        }
    }

    static void dodajKlienta() {
        String imie = wczytaj("Imie: ");
        String nazwisko = wczytaj("Nazwisko: ");
        String telefon = wczytaj("Numer telefonu: ");
        klienci.add(new Klient(imie, nazwisko, telefon));
        System.out.println("Dodano klienta.");
    }

    static void usunKlienta() {
        pokazKlientow();
        if (klienci.isEmpty()) return;
        int nr = liczba("Numer klienta do usuniecia: ");
        if (nr >= 1 && nr <= klienci.size()) {
            klienci.remove(nr - 1);
            System.out.println("Usunieto klienta.");
        } else {
            System.out.println("Nie ma takiego klienta.");
        }
    }

    static String wczytaj(String tekst) {
        System.out.print(tekst);
        return sc.nextLine().trim();
    }

    static int liczba(String tekst) {
        while (true) {
            try {
                return Integer.parseInt(wczytaj(tekst));
            } catch (NumberFormatException e) {
                System.out.println("To nie jest liczba, sprobuj jeszcze raz.");
            }
        }
    }
}