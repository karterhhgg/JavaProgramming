package HackerRank;
import java.util.*;

public class Nineteen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // number of integers
        int m = in.nextInt(); // size of subarray

        Deque<Integer> deque = new ArrayDeque<Integer>();
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);

            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, freqMap.size());

                int removed = deque.removeFirst();
                int count = freqMap.get(removed);
                if (count == 1) {
                    freqMap.remove(removed);
                } else {
                    freqMap.put(removed, count - 1);
                }
            }
        }

        System.out.println(maxUnique);
    }
}

