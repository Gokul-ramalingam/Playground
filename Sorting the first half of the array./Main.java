import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    for(int i = 0;i < n;i++)
      ar[i] = in.nextInt();
    for(int j = (n/2)-1;j >= 0;j--)
    {
      for(int i = 0; i < j;i++)
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
    {
      System.out.print(ar[i]+ " ");
    }
  }
}