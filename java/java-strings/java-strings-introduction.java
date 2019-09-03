import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(Integer.toString(A.length() + B.length()));
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        String A2 = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        String B2 = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();

        System.out.printf("%s %s", A2, B2);
    }
}




