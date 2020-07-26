/*
Q1: Write a method that returns the average of a list of Integers
*/
import java.util.*;
public class Average
{
    public static int averageFun(ArrayList<Integer> a,int n){
        int s=0;
        for(int i=0;i<n;i++){
            s+=a.get(i);
        }
        return s/n;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    ArrayList<Integer> a=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        a.add(sc.nextInt());
	    }
	    int avg=averageFun(a,n);
	    System.out.println(avg);
		
	}
}