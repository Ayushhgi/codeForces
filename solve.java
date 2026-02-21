import java.util.*;
public class solve{
	public static int helper(int n , int[]arr){
		int[]prefix=new int[n];
		prefix[0]=arr[0];
		for(int i=1;i<n;i++){
			prefix[i]=Math.max(prefix[i-1],arr[i]);
		}
		int ans=0;

		for(int i=1;i<=n;i++){
			if(i%2==0){
				int right=(i==n)?Integer.MIN_VALUE:arr[i];
				int left=arr[i-2];
				int curr=arr[i-1];

				if(curr<=right){
					arr[i-1]=prefix[i-1];
					curr=arr[i-1];
					int dif=Math.abs(curr-right);
					if(i<n){
						arr[i]-=dif;
					}
					ans+=dif+1;
				}
				if(curr<=left){
					arr[i-1]=prefix[i-1];
					curr=arr[i-1];
					ans+=Math.abs(curr-left)+1;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(helper(n,arr));
		}
		sc.close();
	}
}