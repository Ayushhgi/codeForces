import java.util.Scanner;

public class LongestDivisorsInterval {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int i=1;
            int cnt=0;
            while(n%i==0){
                cnt++;
                i++;
            }
            System.out.println(cnt);
        }
    }
}
