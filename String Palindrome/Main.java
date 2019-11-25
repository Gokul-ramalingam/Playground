import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String str1="";
      int idx = 0;
      for(int i = str.length()-1;i >= 0;i--)
      {
        str1 += str.charAt(i);
      }
      if(str1.equals(str))
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}