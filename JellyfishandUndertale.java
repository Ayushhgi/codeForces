import java.util.Scanner;
import java.util.*;

public class JellyfishandUndertale {
    public static void main(String []ards){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(); 

            int b=sc.nextInt(); 
            int n=sc.nextInt(); 
            int []arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int tool=0;
            long time=0;
            while(tool<arr.length){
                if(b==0){
                    break;
                }
                if(b>1){
                    time+=(b-1);
                    b=1;
                }
                else{
                    b=Math.min(b+arr[tool],a);
                    time++;
                    b=b-1;
                    tool++;
                }
            }
            if(b>=1){
                time+=(b);
                b=1;
            }
            System.out.println(time);
        }
        sc.close();
    }
}
