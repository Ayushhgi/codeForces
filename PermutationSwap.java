import java.util.HashMap;
import java.util.Scanner;

public class PermutationSwap {
    private static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int hcf=0;
            for(int i=0;i<arr.length;i++){
                int diff = Math.abs(arr[i] - (i + 1));
                hcf = gcd(hcf, diff);
            }
            System.out.println(hcf);
            
        }
        sc.close();
    }
}
