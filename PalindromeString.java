package palindrome.string;
import java.util.*;
/**
 *
 * @author Arpit Sharma
 */
public class PalindromeString {
    static boolean palindrome(String s)
    {
        int j=s.length()-1;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                j--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s= sc.next();

        if(palindrome(s))
        {
            System.out.println(s);
           
        }
		else
            System.out.println("Not a palindrome");
           
    }
    }

