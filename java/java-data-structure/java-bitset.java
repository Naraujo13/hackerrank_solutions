import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        BitSet[] bitSets = {new BitSet(N), new BitSet(N)};

        for (int i = 0; i<M; i++){
            String op = in.next();
            int arg1 = in.nextInt();
            int arg2 = in.nextInt();

            switch(op) {
                case "AND":
                    bitSets[arg1-1].and(bitSets[arg2-1]);
                    break;
                case "OR":
                    bitSets[arg1-1].or(bitSets[arg2-1]);
                    break;
                case "XOR":
                    bitSets[arg1-1].xor(bitSets[arg2-1]);
                    break;
                case "FLIP":
                    bitSets[arg1-1].flip(arg2);
                    break;
                case "SET":
                    bitSets[arg1-1].set(arg2);
                    break;
            }
            System.out.printf(
                "%d %d%n", 
                bitSets[0].cardinality(), bitSets[1].cardinality()
            );
            // System.out.printf("%s %d %d%n", op, arg1, arg2);
        }

    }
}


