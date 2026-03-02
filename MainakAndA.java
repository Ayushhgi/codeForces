import java.util.*;
public class MainakAndA{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int maxi=Integer.MIN_VALUE;
            int mini=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                maxi=Math.max(maxi,arr[i]);
                mini=Math.min(mini,arr[i]);
            }
            int ans=Integer.MIN_VALUE;
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            ans = Math.max(ans, arr[n - 1] - mini);
            ans = Math.max(ans, maxi - arr[0]);
            
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, arr[i - 1] - arr[i]);
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}