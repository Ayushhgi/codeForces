import java.util.*;
public class HalloumiBoxes {
    public static String helper(int k,int[]arr){
        if(k<=1){
            boolean isTrue=false;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    isTrue=true;
                    break;
                }
            }
            return (isTrue)?"NO":"YES";
        }
        return "YES";
    }
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
            int k=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(helper(k,arr));
		}
		sc.close();
	}
}
