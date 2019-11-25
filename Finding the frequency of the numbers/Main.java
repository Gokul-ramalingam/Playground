import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      int k = in.nextInt();
      for(int i = 0;i < n;i++)
      {
        ar[i] = in.nextInt();
      }
      for(int i = 1;i <= k;i++)
      {
        int count = 0;
       for(int j = 0;j < n;j++)
       {
         if(i==ar[j])
           count++;
       }
        System.out.println(i+" "+count);
      }
    }
}