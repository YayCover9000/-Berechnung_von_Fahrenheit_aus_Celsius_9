import javax.imageio.ImageTranscoder;
import java.util.Scanner;
import java.lang.Math;
public class Celsius2FahrenheitTesttreiber {
    public static void main(String [] args) {

        // Aufruf Testtreiber
        Celsius2FahrenheitTesttreiber.Celsius2FahrenheitTesttreiber();
        System.out.println("Bis hier ausgabe Testtreiber");



    }
    public static void Celsius2FahrenheitTesttreiber() {
        // Initialisiere Scanner
        Scanner scanner = new Scanner(System.in);
        // Initialisiere Anzahl an Celsius werten
        int anzahlCelsiusWerte; //TODO mit random Math generieren NICHT mit Scanner einlesen
        // Lese n für Anzahl an Celsius werten ein
        anzahlCelsiusWerte  = scanner.nextInt();
        // anzahlCelsiusWert wird eine random Zahl zugewiesen
        System.out.println("Math.random: " + anzahlCelsiusWerte);
        // Initialisierung int celsius[] und weise Anzahl an plätzen zu, welche mit scanner anzahlCelsiusWerten eingelesen wird
        int celsius[] = new int[anzahlCelsiusWerte];
        // Initialisierung int fahrenheit[] mit selber Größe wie celsius[]
        int fahrenheit[] = new int[anzahlCelsiusWerte];
        // Initialisierung double fahrenheit[]
        double fahrenheitDouble[] = new double[anzahlCelsiusWerte];
        /* // Variable double für Math.random
        double zwischenspeicherCelsius[] = new double[0]; */
        // Array celsius befüllen
        for (int r = 0; r < celsius.length; r++) {
            celsius[r] = (int) (Math.random() * 100);
            System.out.println("looop: " + celsius[r]);
        }
        System.out.println("celsius länge: " + celsius.length);
        for (int c : celsius) {
            System.out.println(c);
        }
        System.out.println("fahrenheit länge: " + fahrenheit.length);

        // übergabe Arrays an Methode berechneCelsius2Fahrenheit
        Celsius2Fahrenheit.berechneCelsius2Fahrenheit(celsius, fahrenheit);
        // Erhalte, double fahrenheit[] zurück //TODO wie erhalte ich einen Wert aus der anderen Klasse und Methode zurück wenn die Methode void ist

        // Übergebe, double fahrenheit[] an ausgeben
        Celsius2Fahrenheit.ausgeben(fahrenheitDouble);


        /* int celsiusTesttreiber[] = new int[3];
        int fahrenheitTesttreiber[] = new int[3];
        for (int l : celsiusTesttreiber) {
            celsiusTesttreiber[l] = (int) Math.random();
        }
        double fahrenheitDoubleTesttreiber[] = new double[3];
        Celsius2Fahrenheit.berechneCelsius2Fahrenheit(celsiusTesttreiber, fahrenheitTesttreiber); */
    }

}
