import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    for(int i = 0;i < n;i++)
    {
      ar[i] = in.nextInt();
    }
     int cnt = 0,l = 0,e = 0;
    for(int i = 0;i < n;i++)
    {
      cnt = 0;
      for(int j = 0;j < n;j++)
      {
        if(ar[i] == ar[j])
          cnt++;
      }
      if(cnt > l)
      {
        l = cnt;
        e = ar[i];
      }
    }
    System.out.println(e);
  }
}