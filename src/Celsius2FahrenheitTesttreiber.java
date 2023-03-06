import javax.imageio.ImageTranscoder;
import java.util.Scanner;
import java.lang.Math;
public class Celsius2FahrenheitTesttreiber {
    public static void main(String [] args) {
        // Aufruf Testtreiber
        Celsius2FahrenheitTesttreiber.Celsius2FahrenheitTesttreiber();
    }
    public static void Celsius2FahrenheitTesttreiber() {
        // Initialisiere Scanner
        Scanner scanner = new Scanner(System.in);
        // Initialisiere Anzahl an Celsius werten
        int anzahlCelsiusWerte;
        // Lese n für Anzahl an Celsius werten ein
        System.out.println("Zahl eingeben um Array größe zu determinieren: ");
        anzahlCelsiusWerte  = scanner.nextInt();
        // Initialisierung int celsius[] und weise Anzahl an plätzen zu, welche mit scanner anzahlCelsiusWerten eingelesen wird
        int celsius[] = new int[anzahlCelsiusWerte];
        // Initialisierung int fahrenheit[] mit selber Größe wie celsius[]
        int fahrenheit[] = new int[anzahlCelsiusWerte];
        // celsius[] befüllen mit random werten aus Math.random
        for (int r = 0; r < celsius.length; r++) {
            celsius[r] = (int) (Math.random() * 100);
            System.out.println("Eingelesene Celsiuswerte: " + celsius[r]);
        }
        // übergabe Arrays an Methode berechneCelsius2Fahrenheit
        Celsius2Fahrenheit.berechneCelsius2Fahrenheit(celsius, fahrenheit);
    }
}
