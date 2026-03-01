import java.util.Scanner;

public class ComparisonString{
    public static void main(String []ayush){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int maxi=0;
            char curr=str.charAt(0);
            int cont=1;
            for(int i=1;i<str.length();i++){
                if(curr==str.charAt(i)){
                    cont++;
                }
                else{
                    maxi=Math.max(maxi,cont);
                    curr=str.charAt(i);
                    cont=1;
                }
            }
            maxi=Math.max(maxi,cont);
            
            System.out.println(maxi+1);
        }

    }
}