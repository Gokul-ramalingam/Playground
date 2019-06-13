import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int li[] = new int[n];
    for(int i = 0;i < n;i++)
    {
     li[i] = in.nextInt();
    }
    func(li , n);
  }
  public static void func(int li[] , int n)
  {
    int a = 0;
    int x = 0;
    for(int i = 0;i < n;i++)
    {
     if(a < li[i])
     {
       a = li[i];
       x = i;
     }
    }
    System.out.print(x);
  }
}