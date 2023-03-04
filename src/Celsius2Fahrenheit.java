public class Celsius2Fahrenheit {
    public static void berechneCelsius2Fahrenheit(int celsius[], int fahrenheit[]) {
        // 1Fahrenheit=1,8∗Celsius+32
        // Initialise double fahrenheitDouble[]
        double fahrenheitDouble[] = new double[celsius.length];
        for (int m : celsius) {
            fahrenheitDouble[m] = celsius[m];
        }
        for (double i : fahrenheitDouble) {
            System.out.println("fahrenheitDouble: " + fahrenheitDouble[(int)i]);
        }


    }
    public static void ausgeben(double fahrenheit[]) {

    }
}
