import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        int n = game.length;

        // -- Guard clause for winning in a single jump with leap
        if (leap >= n)
            return true;

        // -- Creates array to store if visited
        boolean[] visited = new boolean[game.length];
        
        // -- Iterates through options
        return step(0, leap, game, visited);
    }

    private static boolean step(int currentPos, int leap, int[] game, boolean[] visited) {
        
        // -- Guard Clause for winning by walking
        if (currentPos + 1 >= game.length)
            return true;

        // -- Guard Clause for winning by leaping
        if (currentPos + leap >= game.length)
            return true;
        
        // -- Guard Clause to avoid revisiting a state
        if (visited[currentPos] == true)
            return false;
        
        visited[currentPos] = true;
        
        // -- Option of walking
        boolean walking = false;
        if(
            !visited[currentPos + 1] &&
            game[currentPos + 1] == 0
        ) {
            walking = step(currentPos + 1, leap, game, visited);
        }

        // -- Option of leaping
        boolean leaping = false;
        if(
            !walking && 
            !visited[currentPos + leap] &&
            game[currentPos + leap] == 0
        ) {
            leaping = step(currentPos + leap, leap, game, visited);
        }

        // -- Option of walking back
        boolean walkingBack = false;
        if(
            !walking && 
            !leaping && 
            currentPos > 0 &&
            !visited[currentPos - 1] &&
            game[currentPos - 1] == 0
        ) {
            walkingBack = step(currentPos - 1, leap, game, visited);
        }

        return (walking || leaping || walkingBack);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


