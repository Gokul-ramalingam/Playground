import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int sq[] = new int[n];
  int a[] = new int[n];
  for(int i = 0; i < n;i++)
  {
    a[i] = in.nextInt();
  }
  for(int i = 0; i < n;i++)
  {
    int temp = 0;
    for(int j = 0; j < n;j++)
    {
      if(a[i] == a[j])
      {
        temp = temp + 1;
      }
    }
    sq[i] = temp;
  }
  int k = 0;
  int b =0;
  for(int i = 0; i < n;i++)
  {
    if(k < sq[i])
    {
      k = sq[i];
      b = i;
    }
  }
  System.out.print(a[b]);
}
}