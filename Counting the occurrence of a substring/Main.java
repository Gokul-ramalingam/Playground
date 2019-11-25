import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine();
    int count = 0;
    for(int i = 0;i < str.length()-str1.length()+1;i++)
    {
      boolean flag = true;
      for(int j = 0;j < str1.length();j++)
      {
        if(str.charAt(i+j)!=str1.charAt(j))
        {
          flag = false;
          break;
        }
      }
      if(flag == true)
        count++;
    }
    System.out.println(count);
  } 
}