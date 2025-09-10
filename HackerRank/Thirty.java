package HackerRank;
   import java.util.*;

   public class Thirty {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
                return canWinFrom(0, leap, game, new boolean[game.length]);
    }

    private static boolean canWinFrom(int i, int leap, int[] game, boolean[] visited) {
        if (i >= game.length) return true;
        if (i < 0 || game[i] == 1 || visited[i]) return false;

        visited[i] = true;

        return canWinFrom(i + leap, leap, game, visited) ||
               canWinFrom(i + 1, leap, game, visited) ||
               canWinFrom(i - 1, leap, game, visited);

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

