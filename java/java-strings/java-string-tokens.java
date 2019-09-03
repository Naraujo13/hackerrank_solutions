import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.length() > 400000)
            return;

        if (s.trim().isEmpty()){
            System.out.println(0);
            return;
        }
        
        s = s.trim();
        
        String pattern = "(\\s|!|,|\\?|\\.|_|'|@)+";

        String[] tokens = s.split(pattern);

        System.out.println(tokens.length);
        for (String token: tokens){
            if (!token.equals(""))
                System.out.println(token);
        }

        scan.close();
    }
}


