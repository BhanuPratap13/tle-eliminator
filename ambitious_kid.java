import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int  A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int num : A){
            if(num<0){
                list.add(-1*num);
            }
            else{
                list.add(num);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        
    }
}