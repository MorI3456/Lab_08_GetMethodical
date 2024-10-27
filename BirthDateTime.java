import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the year of birth within a valid range
        int year = SafeInput.getRangedInt(in, "Enter the year of birth", 1950, 2015);

        // Get the month of birth within a valid range
        int month = SafeInput.getRangedInt(in, "Enter the month of birth (1-12)", 1, 12);

        // Determine the valid range for days based on the month
        int day;
        switch (month) {
            case 4: case 6: case 9: case 11: // Months with 30 days
                day = SafeInput.getRangedInt(in, "Enter the day of birth (1-30)", 1, 30);
                break;
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter the day of birth (1-29)", 1, 29);
                break;
            default: // Months with 31 days
                day = SafeInput.getRangedInt(in, "Enter the day of birth (1-31)", 1, 31);
                break;
        }

        // Get the hour of birth within a valid range
        int hour = SafeInput.getRangedInt(in, "Enter the hour of birth (1-24)", 1, 24);

        // Get the minute of birth within a valid range
        int minute = SafeInput.getRangedInt(in, "Enter the minute of birth (1-59)", 1, 59);

        // Display the collected date and time of birth
        System.out.println("\nYou were born on: " + year + "-" + month + "-" + day + " at " + hour + ":" + minute);
    }
}
