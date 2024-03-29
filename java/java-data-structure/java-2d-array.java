import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();


        int[] sums = new int[16];

        int index = 0;
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                int top = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];
                int center = arr[i][j];
                int bottom = arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];

                sums[index++] = top + center + bottom;
            }
        }
        java.util.Arrays.sort(sums);
        System.out.println(sums[15]);

        // for (int i = 0; i < sums.length; i++)
        //     System.out.println(sums[i]);

    }
}

