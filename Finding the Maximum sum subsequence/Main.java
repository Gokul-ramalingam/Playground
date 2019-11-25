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
    int sum = 0,l = 0;
    for(int i = 0;i < n;i++)
    {
      if(i != n-1 && ar[i]<ar[i+1])
      {
        sum += ar[i];
      }
      else if(i == n-1)
      {
        sum += ar[i];
      }
      else
      {
        sum +=ar[i];
        if(l < sum)
        {
          l = sum;
        }
        sum = 0;
      }
    }
    if(l<sum)
    {
      System.out.println(sum);
    }
    else
    {
      System.out.println(l);
    }
  }
}