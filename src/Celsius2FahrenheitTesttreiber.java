import java.util.Scanner;
public class Celsius2FahrenheitTesttreiber {
    public static void main(String [] args) {
        // Initialisiere Scanner
        Scanner scanner = new Scanner(System.in);
        // Initialisiere Anzahl an Celsius werten
        int anzahlCelsiusWerte; //TODO mit random Math generieren NICHT mit Scanner einlesen
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
        System.out.println("Bis hier ausgabe Testtreiber");


        // übergabe Arrays an Methode berechneCelsius2Fahrenheit
        Celsius2Fahrenheit.berechneCelsius2Fahrenheit(celsius, fahrenheit);
        // Erhalte, double fahrenheit[] zurück //TODO wie erhalte ich einen Wert aus der anderen Klasse und Methode zurück wenn die Methode void ist

        // Übergebe, double fahrenheit[] an ausgeben
        Celsius2Fahrenheit.ausgeben(fahrenheitDouble);

    }
    public static void Celsius2FahrenheitTesttreiber() {
        int celsiusTesttreiber[] = new int[3];
        int fahrenheitTesttreiber[] = new int[3];
        double fahrenheitDoubleTesttreiber[] = new double[3];
        Celsius2Fahrenheit.berechneCelsius2Fahrenheit(celsiusTesttreiber, fahrenheitTesttreiber);
    }

}
