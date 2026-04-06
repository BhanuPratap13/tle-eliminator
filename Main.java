import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Set<Integer>set = new HashSet<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a [] = new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int num : a){
                set.add(num);
            }
            if(set.contains(k)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}