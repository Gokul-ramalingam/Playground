import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      int d[] = new int[n];
      for(int i = 0;i < n;i++)
      {
        ar[i] = in.nextInt();
      }
      int idx=0;
     for(int j = n-1;j >= 0;j--)
     {
       d[idx++] = ar[j];
     }
      boolean flag = true;
      for(int i = 0;i < n;i++)
      {
        if(d[i]!=ar[i])
        {
          flag = false;
          break;
        }
      }
      if(flag == true)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}