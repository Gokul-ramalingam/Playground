import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i = 0; i<n;i++)
      {
      a[i] = in.nextInt();
      }
      int b[] = new int[n];
      int c = 0;
      int flag =1;
      for(int i = n-1; i>=0;i--)
      {
       b[c] = a[i];
       c++;
      }
      for(int i = 0; i<n;i++)
      {
       if(a[i] != b[i])
       {
         flag = 0;
         break;
       }
      }
      if(flag == 1)
      {
       System.out.print("Yes"); 
      }
      else
      {
      System.out.print("No"); 
      }
    }
}