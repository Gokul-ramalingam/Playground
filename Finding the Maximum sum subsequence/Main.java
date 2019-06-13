import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int temp = 0;
  int k = 0;
  int a[] = new int[n];
  for(int i = 0; i < n;i++)
  {
    a[i] = in.nextInt();
  }
  int sr = 0;
  int sp = 0;
  int sq[] = new int[2*n];
  for(int i = 0; i < n-1;i++)
  {
    if(a[i] > a[i+1]) // 5 smaller than 50 condition false
    {
      sq[sr] = sp; 
      sr++;
      sq[sr] = i;
      sr++;
      sp = i+1;
    }
  }
  if(sp != n-1)
  {
      sq[sr] = sp; 
      sr++;
      sq[sr] = n-1;
      sr++;
  }
  if(sp == n-1)
  {
      sq[sr] = sp; 
      sr++;
      sq[sr] = n-1;
      sr++;
  }
  for(int i = 0;i < sr-1;i=i+2)
  {
   sp = sq[i];
   int end = sq[i+1];
   temp = 0;
    for(int j = sp;j <= end;j++)
    {
     temp = temp + a[j] ;
    }
    if(k < temp)
    {
      k = temp;
    }
  }
  System.out.println(k);
}
}