import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int r=0;
        int l=0;
        int len=0;
        while(r<arr.length){
            if(r+1<arr.length && (arr[r+1]-arr[r])<=k){
                r++;
            }
            else{
                len=Math.max(len,r-l+1);
                r++;
                l=r;
            }
        }
        System.out.println((arr.length-len));
        }
        
    }
}
