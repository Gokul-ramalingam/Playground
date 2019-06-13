import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean flag = false;
    if(n < 0)
    {
       n = n * -1;
      flag = true;
    }
    int b = n;
    int i = 0;
    while(n > 0)
    {
      n = n/10;
      i++;
    }
    int temp = i-1;
    char ch[] = new char[i];
    while(i > 0)
    {
      ch[temp] =(char) ((b % 10) + '0');
      b = b/10;
      i--;
      temp--;
    }
    if(flag == false)
    {
    System.out.print(ch);
    }
    else
    {
    System.out.print("-"); 
    System.out.print(ch); 
    }
  }
}