import java.util.*;
public class VasilijeinCacak {
    public static void main(String []main){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long x = sc.nextLong();
            
            long maxSum=((long)n*(n+1)/2)-((long)(n-k)*(n-k+1)/2);
            long minSum=((long)k*(k+1)/2);
            if(x<minSum || x>maxSum){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
