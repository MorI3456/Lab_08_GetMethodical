public class CtoFTableDisplay {

    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("---------------------------");

        // Loop through Celsius values from -100 to 100 and display their Fahrenheit equivalents
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%-10d | %-10.2f\n", celsius, fahrenheit);
        }
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius the Celsius temperature to convert
     * @return the Fahrenheit equivalent
     */
    public static double CtoF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
