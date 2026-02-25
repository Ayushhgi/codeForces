import java.util.HashMap;
import java.util.Scanner;

public class Chemistry{
    public static String helper(int n,int k ,String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        int oddCnt=0;
        for (char key : map.keySet()) {
            if ((map.get(key) % 2) == 1) {
                oddCnt++;
            }
        }
        if (oddCnt> k+1) {
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
            int k=sc.nextInt();
			String str=sc.next();
            System.out.println(helper(n,k,str));
		}
		sc.close();
	}
}