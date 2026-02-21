import java.util.Scanner;

public class LineTrip {
    public static int helper(int x,int[]arr){
        int maxi=(x-arr[arr.length-1])*2;
        maxi=Math.max(maxi,arr[0]-0);
        for(int i=1;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]-arr[i-1]);
        }
        return maxi;
    }
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
            int x=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(helper(x,arr));
		}
		sc.close();
	}
}
