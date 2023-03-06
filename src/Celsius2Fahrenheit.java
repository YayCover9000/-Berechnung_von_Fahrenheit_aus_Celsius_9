public class Celsius2Fahrenheit {
    public static void berechneCelsius2Fahrenheit(int[] celsius, int[] fahrenheit) {
        // Fahrenheit = 1,8∗Celsius+32
        // Initialise double fahrenheitDouble[]
        double fahrenheitDouble[] = new double[celsius.length];
        for (int m = 0; m < fahrenheitDouble.length; m++) {
            fahrenheitDouble[m] = (1.8 * celsius[m] + 32);
        }
        Celsius2Fahrenheit.ausgeben(fahrenheitDouble);
    }
    public static void ausgeben(double fahrenheit[]) {
        if(fahrenheit == null){
            System.out.println("Array ist leer.");
        } else {
            for (double a : fahrenheit) {
                System.out.println("Fahrenheit: " + a);
            }
        }
    }
}
