import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Gets N and the starting L list
        int n = scan.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for(int i=0; i<n; i++)
            L.add(scan.nextInt());
        
        // Get q - number of queries
        int q = scan.nextInt();
        // For each query, read and execute it
        for(int i = 0; i < q; i++){

            // -- Get query type
            String s = scan.next();

            // -- Insert Query
            if (s.equals("Insert")){
                int x = scan.nextInt();
                int y = scan.nextInt();
                L.add(x, y);
            }
            // -- Delete Query
            else {
                int x = scan.nextInt();
                L.remove(x);
            }
        }
        scan.close();

        /* Print our updated Linked List */
        for (Integer num : L) {
            System.out.print(num + " ");
        }

        
    }
}


