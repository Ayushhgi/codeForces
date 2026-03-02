import java.util.*;
public class NotDividing {
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[]arr=new long[n+1];
            for(int i=1;i<arr.length;i++){
                arr[i]=sc.nextLong();
            }
            if(arr[1]==1){
                arr[1]++;
            }
            for(int i=2;i<arr.length;i++){
                if(arr[i]%arr[i-1]==0){
                    arr[i]++;
                }
            }
            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
