/*
Q2: Given a list of Strings, write a method that returns a list of all String that start with the letter 'a'(lower case)
and have exactly 3 letters.
*/
import java.util.*;
public class Main
{
    public static void helper(int n,ArrayList<String> a,ArrayList<String> ans){
        for(int i=0;i<n;i++){
            String s=a.get(i);
            if(s.charAt(0)=='a' && s.length()==3){
                ans.add(s);
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    ArrayList<String> a=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        a.add(sc.next());
	    }
	    ArrayList<String> ans=new ArrayList<>();
	    helper(n,a,ans);
	    System.out.println(ans);
		
	}
}