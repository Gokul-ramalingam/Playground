import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    for(int i = 0;i < n;i++)
    {
      ar[i] = in.nextInt();
    }
     int cnt = 0,l = 0;
    for(int i = 0;i < n;i++)
    {
      if(ar[i]==1)
      {
        cnt++;
      }
      else
      {
        if(cnt > l)
        {
          l = cnt;
          cnt = 0;
        }
      }
    }
      if(cnt >l)
       System.out.println(cnt);
      else
        System.out.println(l);
  }
}