import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
     Scanner in = new Scanner(System.in);
     String a = in.nextLine();
     String s = a;
     String s1 = "";
      int l = s.length();
     for(int i = l-1;i >=0;i--)
     {
       char ch = s.charAt(i);
       s1 = s1 + ch;
     }

        if(s1.equals(s))
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    } 
}