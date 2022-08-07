public class String_test
{
    public static void main(String args[])
    {
        byte b[]= { 34,54,56,78,21,9,8,67,23 };
        String s=new String(b,2,6);
        System.out.println(s);
    }
}