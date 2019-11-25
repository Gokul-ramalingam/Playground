import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      for(int i = 0;i < n;i++)
      {
        ar[i] = in.nextInt();
      }
      
      for(int i = 1;i <= n;i++)
      {
        boolean flag = false;
        for(int j = 0;j<n;j++)
        {
          if(ar[j]==i)
          {
            flag = true;
            break;
          }
        }
        if(flag == false)
        {
          System.out.print(i);
          break;
        }
      }
    }
}