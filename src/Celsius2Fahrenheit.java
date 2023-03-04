public class Celsius2Fahrenheit {
    public static void berechneCelsius2Fahrenheit(int celsius[], int fahrenheit[]) {
        // 1Fahrenheit=1,8∗Celsius+32




        // Initialise double celsiusDouble[]
        double celsiusDouble[] = new double[celsius.length];
        // Initialise double fahrenheitDouble[]
        double fahrenheitDouble[] = new double[celsius.length];
        // Cast Celsius to double
        for (int j : celsius) {
            celsiusDouble[j] = celsius[j];
        }
        for (double e : celsiusDouble) {
            System.out.println("celsiusDouble: " + celsiusDouble[(int) e]);
        }
        // put double celsius in double fahrenheit array
        for (double k : fahrenheitDouble) {
            fahrenheitDouble[(int) k] = celsiusDouble[(int) k];
        }


    }
    public static void ausgeben(double fahrenheit[]) {

    }
}
