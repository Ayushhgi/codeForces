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
            int ans=0;
            if(arr[0]==mini){
                int large=Integer.MIN_VALUE;
                for(int i=1;i<arr.length;i++){
                    large=Math.max(large,arr[i]);
                }
                ans=Math.max(ans,large-arr[0]);
            }
            else if(arr[arr.length-1]==maxi){
                int small=Integer.MAX_VALUE;
                for(int i=0;i<arr.length-1;i++){
                    small=Math.min(small,arr[i]);
                }
                ans=Math.min(ans,maxi-small);
            }
            else{
                for(int i=1;i<arr.length;i++){
                    ans=Math.max(ans,arr[i-1]-arr[i]);
                }
            }
            ans=Math.max(ans,arr[arr.length-1]-arr[0]);
            System.out.println(ans);
        }
        sc.close();
    }
}