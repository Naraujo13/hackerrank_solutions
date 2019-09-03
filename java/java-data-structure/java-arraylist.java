import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> arrayOfArrays = new ArrayList<>();

        // Reads N arrays and creates array of arrays
        for (int i = 0; i < n; i++){
            // Reads d integers and put into array
            int d = scan.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for(int j = 0; j < d; j++)
                array.add(scan.nextInt());
            arrayOfArrays.add(array);
        }

        // Reads Q queries and execute them
        int q = scan.nextInt();
        for(int j = 0; j < q; j++){
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            try {
                System.out.println(arrayOfArrays.get(x).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }                
        }
    }
}


