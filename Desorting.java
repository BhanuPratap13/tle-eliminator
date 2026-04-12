import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a [] = new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;
            int b [] = Arrays.copyOf(a,a.length);
            Arrays.sort(b);
            if(!Arrays.equals(a,b)){
                System.out.println(0);
                continue;
            }
            else{
                for(int i=0;i<a.length-1;i++){    
                    int gap = a[i+1]-a[i];
                    int diff = gap/2+1;
                    ans=Math.min(ans,diff);
                }
            }
            System.out.println(ans);
            
        }
    }
}