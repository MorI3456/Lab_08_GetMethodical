import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for a Social Security Number in the format ###-##-####
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered a valid SSN: " + ssn);

        // Prompt for a UC student M number in the format M##### or m#####
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("You entered a valid M number: " + mNumber);

        // Prompt for a menu choice with options [O]pen, [S]ave, [V]iew, or [Q]uit
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [O]pen, [S]ave, [V]iew, or [Q]uit", "^[OoSsVvQq]$");
        System.out.println("You selected menu option: " + menuChoice.toUpperCase());
    }
}
