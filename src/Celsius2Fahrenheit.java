public class Celsius2Fahrenheit {
    public static void berechneCelsius2Fahrenheit(int celsius[], int fahrenheit[]) {
        // 1Fahrenheit=1,8∗Celsius+32
        // Initialise double fahrenheitDouble[]
        double fahrenheitDouble[] = new double[celsius.length -1];
        for (double m : fahrenheitDouble) {
            fahrenheitDouble[(int) m] = (1.8 * celsius[(int) m] + 32);
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
