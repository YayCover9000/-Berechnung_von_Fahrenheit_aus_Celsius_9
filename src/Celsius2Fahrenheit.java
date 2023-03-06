public class Celsius2Fahrenheit {
    public static void berechneCelsius2Fahrenheit(int[] celsius, int[] fahrenheit) {
        // 1Fahrenheit=1,8∗Celsius+32
        // Initialise double fahrenheitDouble[]
        double fahrenheitDouble[] = new double[celsius.length];
        for (int m = 0; m < fahrenheitDouble.length; m++) {
            fahrenheitDouble[m] = (1.8 * celsius[m] + 32);
            System.out.println("Dinge");
        }
        for (double d : fahrenheitDouble) {
            System.out.println(d);
        }
        System.out.println("Methode Berechnung Endet hier");
        /* // Test out for berechneCelsius2Fahrenheit[]
        for (double i : fahrenheitDouble) {
            System.out.println("fahrenheitDouble: " + fahrenheitDouble[(int)i]);
        } */
        Celsius2Fahrenheit.ausgeben(fahrenheitDouble);





    }
    public static void ausgeben(double fahrenheit[]) {
        for (double a : fahrenheit) {
            System.out.println(a);
        }
        System.out.println("Methode ausgeben Endet hier");
    }
}
