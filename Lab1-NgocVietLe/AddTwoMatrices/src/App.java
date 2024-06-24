import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var inputScanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = inputScanner.nextInt();
        System.out.print("Enter number of columns: ");
        int numCols = inputScanner.nextInt();

        int[][] matrix1 = new int[numRows][numCols];
        int[][] matrix2 = new int[numRows][numCols];

        System.out.println("Enter the elements of the first matrix, separated by space and newline: ");
        inputScanner.nextLine();
        for (int i = 0; i < numRows; i++) {
            var line = inputScanner.nextLine();
            var strArray = line.split(" ");
            for (int j = 0; j < numCols; j++) {
                matrix1[i][j] = Integer.parseInt(strArray[j]);
            }
        }

        System.out.println("Enter the elements of the second matrix, separated by space and newline: ");
        for (int i = 0; i < numRows; i++) {
            var line = inputScanner.nextLine();
            var strArray = line.split(" ");
            for (int j = 0; j < numCols; j++) {
                matrix2[i][j] = Integer.parseInt(strArray[j]);
            }
        }

        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int sum = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        inputScanner.close();
    }
}