import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            // If k >= 2 → always YES
            if (k >= 2) {
                System.out.println("YES");
                continue;
            }
 
            // If k == 1 → check sorted
            int i;
            for (i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    System.out.println("NO");
                    break;
                }
            }
 
            if (i == n) {
                System.out.println("YES");
            }
        }
    }
}
