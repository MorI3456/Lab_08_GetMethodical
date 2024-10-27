import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Testing getNonZeroLenString:");
        String nonZeroString = SafeInput.getNonZeroLenString(in, "Enter a non-zero length string");
        System.out.println("You entered: " + nonZeroString);

        System.out.println("\nTesting getInt:");
        int intVal = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered: " + intVal);

        System.out.println("\nTesting getDouble:");
        double doubleVal = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered: " + doubleVal);

        System.out.println("\nTesting getRangedInt:");
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer between 1 and 10", 1, 10);
        System.out.println("You entered: " + rangedInt);

        System.out.println("\nTesting getRangedDouble:");
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double between 0.5 and 5.5", 0.5, 5.5);
        System.out.println("You entered: " + rangedDouble);

        System.out.println("\nTesting getYNConfirm:");
        boolean ynConfirm = SafeInput.getYNConfirm(in, "Do you agree?");
        System.out.println("You selected: " + (ynConfirm ? "Yes" : "No"));

        System.out.println("\nTesting getRegExString:");
        String regExStr = SafeInput.getRegExString(in, "Enter a string that matches '[A-Za-z]{3}'", "[A-Za-z]{3}");
        System.out.println("You entered: " + regExStr);

        System.out.println("\nTesting prettyHeader:");
        SafeInput.prettyHeader("Welcome to the Program");
    }
}
