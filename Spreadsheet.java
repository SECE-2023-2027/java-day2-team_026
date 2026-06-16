import java.util.Scanner;

public class Spreadsheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] colSum = new int[n];
        int grandTotal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
                rowSum += arr[i][j];
                colSum[j] += arr[i][j];
            }
            grandTotal += rowSum;
            System.out.println(rowSum);
        }
        for (int j = 0; j < n; j++) {
            System.out.print(colSum[j] + "\t");
        }
        System.out.println(grandTotal);
        sc.close();
    }
}