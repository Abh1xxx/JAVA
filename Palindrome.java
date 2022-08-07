import java.util.*;
class Palindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String s;
        int len,i,flag=0;
        System.out.print("\nEnter the String \t:");
        s=sc.nextLine();
        s=s.toLowerCase();
        len=s.length();
        System.out.println(len);
        for(i=0;i<=len/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-1-i))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Palindrome");
        }
        else
        {
           System.out.println("not palindrome"); 
        }
    }
}