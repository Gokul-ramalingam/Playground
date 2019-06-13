import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine();
    String sb = str;
    String sb1 = str1 ;
    String temp = sb + sb;
    int l = sb.length();
    String s = temp.substring(l-2,l+4);
    if(s.equals(sb1)==true)
    {
      System.out.print("Yes");
    }
    else
     {
       System.out.print("No");
     }
    }
    }