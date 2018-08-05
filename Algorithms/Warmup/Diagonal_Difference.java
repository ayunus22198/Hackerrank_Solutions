import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++) {
                if(i == j) {
                    leftToRightDiagonal += arr[i][j];
                }
            }
        }
        
        int len = arr.length - 1;
        for(int l = 0;l<arr.length;l++) {
            for(int m =  arr[l].length -1;m>=0;m--) {
                if(l + m == len) {
                    
                     rightToLeftDiagonal += arr[l][m];
                    
                }
            }
        }
        int diff = leftToRightDiagonal - rightToLeftDiagonal;
        int abs = Math.abs(diff);
        return abs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}