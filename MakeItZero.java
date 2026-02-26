import java.util.Scanner;

public class MakeItZero {
    public static void main(String[]ayush){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];

            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            if((n&1)==0){
                System.out.println(2);
                System.out.println(1+" "+n);
                System.out.println(1+" "+n);
            }
            else{
                System.out.println(4);
                System.out.println(1+" "+(n-1));
                System.out.println(1+" "+(n-1));
                System.out.println((n-1)+" "+n);
                System.out.println((n-1)+" "+n);
            }
        }
    }
}
