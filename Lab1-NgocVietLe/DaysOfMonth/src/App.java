import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] arguments) throws Exception {
        var fullMonths = new ArrayList<String>(
                Arrays.asList("January", "February", "March", "April", "May", "June", "July",
                        "August",
                        "September", "October", "November", "December"));
        var abbrMonths = new ArrayList<String>(
                Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
        var inputScanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        var inputMonth = inputScanner.nextLine();
        if (inputMonth.length() == 4 && inputMonth.charAt(3) == '.') {
            inputMonth = inputMonth.substring(0, 3);
        }
        System.out.print("Enter year: ");
        var inputYear = inputScanner.nextInt();
        inputScanner.close();

        int daysCount = -1;
        try {
            daysCount = calculateDaysCount(Integer.parseInt(inputMonth), inputYear);
        } catch (Exception e) {
            if (fullMonths.indexOf(inputMonth) != -1) {
                daysCount = calculateDaysCount(fullMonths.indexOf(inputMonth) + 1, inputYear);
            } else if (abbrMonths.indexOf(inputMonth) != -1) {
                daysCount = calculateDaysCount(abbrMonths.indexOf(inputMonth) + 1, inputYear);
            }
        }

        if (daysCount != -1) {
            System.out.println("Number of days in " + inputMonth + " " + inputYear + " is " + daysCount);
        } else {
            System.out.println("Invalid month");
        }
    }

    public static int calculateDaysCount(int monthNumber, int year) {
        return switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if (year % 400 == 0 || year % 4 != 0) {
                    yield 28;
                } else {
                    yield 29;
                }
            }
            default -> -1;
        };
    }

}