import java.util.HashMap;
import java.util.Scanner;

public class PermutationSwap {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            
            
            int ans=0;
            for(int i=0;i<n;i++){
                if(Math.abs(arr[i]-(i+1))<=Math.floor(n/2)){
                    ans=Math.max(ans,Math.abs(arr[i]-(i+1)));   
                } 
            }
            System.out.println("answer->"+ans);
        }
        sc.close();
    }
}
