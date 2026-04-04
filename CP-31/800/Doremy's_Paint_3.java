
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> freq = new HashMap<>();
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
 
            if (freq.size() > 2) {
                System.out.println("No");
            } else {
                int min = Collections.min(freq.values());
                int max = Collections.max(freq.values());
 
                if (max - min <= 1) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}