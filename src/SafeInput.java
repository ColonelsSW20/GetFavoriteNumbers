import java.util.Scanner;
public class SafeInput {
    // Gets a non-empty String from the user
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
            if (retString.trim().isEmpty()) {
                System.out.println("You must enter something. Please try again.");
            }
        } while (retString.trim().isEmpty());
        return retString;
    }
    // Gets an integer from the user
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            try {
                retInt = Integer.parseInt(pipe.nextLine().trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        } while (!valid);
        return retInt;
    }
    // Gets a double from the user
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            try {
                retDouble = Double.parseDouble(pipe.nextLine().trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!valid);
        return retDouble;
    }
}
