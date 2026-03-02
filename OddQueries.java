import java.util.Scanner;

public class OddQueries {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int []arr=new int[n+1];
            for(int i=1;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            long []prefix=new long[n+1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }
            for(int i=0;i<q;i++){
                int l = sc.nextInt();
                int r = sc.nextInt();  
                int k = sc.nextInt();
                long rangeSum = prefix[r] - prefix[l - 1];
                long total=prefix[prefix.length-1];
                long newRangeSum = (long) (r - l + 1) * k;

                long newTotal = total - rangeSum + newRangeSum;
                if(((newTotal)&1)==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    } 
}
