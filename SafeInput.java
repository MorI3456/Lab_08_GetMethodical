import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // discard invalid input
            }
            pipe.nextLine(); // clear buffer
        } while (!valid);
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a double.");
                pipe.next(); // discard invalid input
            }
            pipe.nextLine(); // clear buffer
        } while (!valid);
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high) {
                    valid = true;
                } else {
                    System.out.println("Error: Input must be between " + low + " and " + high);
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // discard invalid input
            }
            pipe.nextLine(); // clear buffer
        } while (!valid);
        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                if (retDouble >= low && retDouble <= high) {
                    valid = true;
                } else {
                    System.out.println("Error: Input must be between " + low + " and " + high);
                }
            } else {
                System.out.println("Invalid input. Please enter a double.");
                pipe.next(); // discard invalid input
            }
            pipe.nextLine(); // clear buffer
        } while (!valid);
        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toLowerCase();
        } while (!response.equals("y") && !response.equals("n"));
        return response.equals("y");
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response;
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
            if (!response.matches(regEx)) {
                System.out.println("Input does not match the required format.");
            }
        } while (!response.matches(regEx));
        return response;
    }

    public static void prettyHeader(String msg) {
        int width = 60;
        int msgWidth = msg.length();
        int padding = (width - msgWidth - 6) / 2;

        System.out.println("*".repeat(width));
        System.out.print("***");
        System.out.print(" ".repeat(padding));
        System.out.print(msg);
        System.out.println(" ".repeat(padding) + "***");
        System.out.println("*".repeat(width));
    }
}
