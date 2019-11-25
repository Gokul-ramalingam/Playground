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
      ar[i] = in.nextInt();
    for(int i = (n/2)-1;i >=0;i--)
    {
      for(int j = 0;j < i;j++)
      {
        if(ar[i] < ar[j])
        {
          int temp = ar[i];
          ar[i] = ar[j];
          ar[j] = temp;
        }
      }
    }
    for(int i = n-1;i >=n/2;i--)
    {
      for(int j = n/2;j < i;j++)
      {
        if(ar[i] > ar[j])
        {
          int temp = ar[i];
          ar[i] = ar[j];
          ar[j] = temp;
        }
      }
    }
    for(int i = 0;i < n;i++)
      System.out.print(ar[i]+" ");
  }
}