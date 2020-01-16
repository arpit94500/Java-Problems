import java.util.*;
public class WordCount {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s="  Hello I am Java";
		String st[]=s.split(" ");
		for(String i:st)
		{
		   
		        count++;
		}
		
		System.out.println(count);

	}
}
