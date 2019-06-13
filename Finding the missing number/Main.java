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
      int count = 1;
      for(int i = 0; i<n;i++)
      {
      b[i] = count;
        count++;
      }
      for(int i = 0; i<n;i++)
      {
        int flag = 0;
      for(int j = 0; j<n;j++)
      {
        if(b[i] == a[j])
        {
          flag = 1;
          break;
        }
      }
      if(flag == 0)
      {
       System.out.print(b[i]); 
      }
      }
      
    }
}