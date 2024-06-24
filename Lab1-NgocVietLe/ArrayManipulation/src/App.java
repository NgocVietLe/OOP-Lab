import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] arguments) throws Exception {
        var inputScanner = new Scanner(System.in);
        System.out.println("Enter elements of list separated by space: ");
        String inputLine = inputScanner.nextLine();
        inputScanner.close();
        var strArray = inputLine.split(" ");
        var numList = new ArrayList<Integer>();
        for (String element : strArray) {
            numList.add(Integer.parseInt(element));
        }
        numList.sort((num1, num2) -> num1 - num2);
        double totalSum = 0.0d;
        for (var number : numList) {
            totalSum += number;
        }
        System.out.println("Sum = " + totalSum);
        System.out.println("Average = " + (totalSum / numList.size()));
    }
}