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
       int k = in.nextInt();
      for(int i = 0;i < n;i++)
      {
        for(int j = i+1;j < n;j++)
        {
          if(ar[i] > ar[j])
          {
            int temp = ar[i];
             ar[i] = ar[j];
             ar[j] = temp;
          }
        }
      }
      System.out.println(ar[n-k]);
    }
}