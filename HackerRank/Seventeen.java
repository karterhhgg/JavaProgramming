package HackerRank;
import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score;  // descending by score
        } else {
            return a.name.compareTo(b.name);  // ascending by name
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Seventeen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);

        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %d\n", player[i].name, player[i].score);
        }
    }
}