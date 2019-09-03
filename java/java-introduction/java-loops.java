import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
          
            int previous = a;
            for(int j=0; j<n; j++) {
              int element = (int)(Math.pow(2, j)) * b + previous;
              System.out.printf("%d ", element);
              previous = element;
            }
            System.out.printf("%n");

        }
        in.close();
    }
}


