import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    for(int i = 0;i < n;i++)
      ar[i] = in.nextInt();
    for(int i = 0;i < n;i++)
    {
      for(int j = i+1;j < n;j++)
      {
        if(ar[i] < ar[j] && ar[j] >ar[j-1])
          System.out.println(ar[i]+","+ar[j]);
      }
    }
  }
}