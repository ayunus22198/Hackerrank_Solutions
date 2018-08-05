import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int total = arr.length;
        int pos = 0;
        int neg = 0;
        int neutral = 0;
        double fractionPos = 0;
        double fractionNeg = 0;
        double fractionNeutral = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else {
                neutral++;
            }
        }
        fractionPos = (double)pos/total;
        fractionNeg = (double)neg/total;
        fractionNeutral = (double)neutral/total;
        System.out.println(fractionPos);
        System.out.println(fractionNeg);
        System.out.println(fractionNeutral);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}