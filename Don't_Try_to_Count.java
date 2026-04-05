import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
 
            int operations = 0;
            String current = x;
            while (current.length() <= 100) {
                if (current.contains(s)) {
                    System.out.println(operations);
                    break;
                }
                current = current + current;
                operations++;
            }
 
            if (!current.contains(s)) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}