import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    String b = "aeiou";
    String c = "AEIOU";
    int l = a.length();
    StringBuilder sb = new StringBuilder("");
    for(int i = 0 ;i < l;i++)
    {
      int flag = 0;
    if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') 
    {
    for(int j = 0 ;j < 5;j++)
    {
      if(a.charAt(i) == b.charAt(j)) 
      {
        flag = 1;
      }
    }
     if(flag == 0)
     {
       sb.append(a.charAt(i));
     }
    }
    else if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') 
    {
    for(int j = 0 ;j < 5;j++)
    {
      if(a.charAt(i) == c.charAt(j)) 
      {
        flag = 1;
      }
    }
     if(flag == 0)
     {
       sb.append(a.charAt(i));
     }
    }
    else
     {
       sb.append(a.charAt(i)); 
     }
    }
    System.out.print(sb);
  }
}