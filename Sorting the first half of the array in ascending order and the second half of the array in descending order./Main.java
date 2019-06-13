import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
     Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i = 0 ; i < n; i++)
    {
     a[i] = in.nextInt();
    }
    for(int i = 1 ; i < n/2; i++)
    {
      for(int j = 0; j < i;j++)
      {
        if(a[j] > a[i])
        {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    for(int i =(n/2)+1 ; i < n; i++)
    {
      for(int j =  n/2; j < i;j++)
      {
        if(a[j] < a[i])
        {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
     for(int i = 0 ; i < n; i++)
    {
       System.out.print(a[i] +" ");
     }
  }
}