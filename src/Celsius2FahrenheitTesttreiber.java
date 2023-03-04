import java.util.Scanner;
public class Celsius2FahrenheitTesttreiber {
    public static void main(String [] args) {
        // Initialisiere Scanner
        Scanner scanner = new Scanner(System.in);
        // Initialisiere Anzahl an Celsius werten
        int anzahlCelsiusWerte;
        // Lese n für Anzahl an Celsius werten ein
        anzahlCelsiusWerte  = scanner.nextInt();
        // Initialisierung int celsius[] und weise Anzahl an plätzen zu, welche mit scanner anzahlCelsiusWerten eingelesen wird
        int celsius[] = new int[anzahlCelsiusWerte];
        // Initialisierung int fahrenheit[] mit selber Größe wie celsius[]
        int fahrenheit[] = new int[anzahlCelsiusWerte];
        // Initialisierung double fahrenheit[]
        double fahrenheitDouble[] = new double[anzahlCelsiusWerte];
        // übergabe Arrays an Testtreiber
        Celsius2FahrenheitTesttreiber.Celsius2FahrenheitTesttreiber();
        // übergabe Arrays an Methode berechneCelsius2Fahrenheit
        Celsius2Fahrenheit.berechneCelsius2Fahrenheit(celsius, fahrenheit);
        // Erhalte, double fahrenheit[] zurück
        // Übergebe double fahrenheit[] an ausgeben
        Celsius2Fahrenheit.ausgeben(fahrenheitDouble);

    }
    public static void Celsius2FahrenheitTesttreiber() {

    }

}
