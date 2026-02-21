import java.util.*;
public class Solution{
	public static boolean isPrime(long n) {
    		if (n <= 1) return false;
    		if (n <= 3) return true;

   		if (n % 2 == 0 || n % 3 == 0) return false;

    		for (long i = 5; i * i <= n; i += 6) {
        		if (n % i == 0 || n % (i + 2) == 0)
            			return false;
    		}
    		return true;
	}
	public static long solve(long n,long[] arr){
		long maxi=Long.MIN_VALUE;
		for(int i=0;i<n;i++){
		 	maxi=Math.max(maxi,arr[i]);
		}
		long ans=0;
		for(long i=2;i<=maxi+1;i++){
			if(isPrime(i)){
				for(int k=0;k<n;k++){
					if(arr[k]%i!=0){
						ans=i;
						break;
					}
				}
			}
			if(ans!=0){
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			long []arr=new long[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextLong();
			}
			System.out.println(solve(n,arr));
		}
	}
}