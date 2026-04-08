import java.util.Scanner;
 
public class TargetPractice {
 
    private static final int[][] score = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
        {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
        {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
        {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
        {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
        {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
        {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
        {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
 
        while (t-- > 0) {
            int totalScore = 0;
 
            for (int i = 0; i < 10; i++) {
                String s = scanner.next();
                for (int j = 0; j < 10; j++) {
                    if (s.charAt(j) == 'X') {
                        totalScore += score[i][j];
                    }
                }
            }
            System.out.println(totalScore);
        }
    }
}