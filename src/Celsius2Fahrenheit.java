public class Celsius2Fahrenheit {
    public static void berechneCelsius2Fahrenheit(int celsius[], int fahrenheit[]) {
        // 1Fahrenheit=1,8∗Celsius+32
        // Initialise double fahrenheitDouble[]
        double fahrenheitDouble[] = new double[celsius.length];
        for (int m : celsius) {
            fahrenheitDouble[m] = (1.8 * celsius[m] + 32);
        }
        // Test out for berechneCelsius2Fahrenheit[]
        for (double i : fahrenheitDouble) {
            System.out.println("fahrenheitDouble: " + fahrenheitDouble[(int)i]);
        }
        Celsius2Fahrenheit.ausgeben(fahrenheitDouble);





    }
    public static void ausgeben(double fahrenheit[]) {
        for (double a : fahrenheit) {
            System.out.println("Fahrenheit: " + fahrenheit[(int) a]);
        }
    }
}
