import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l[] = new int[n];
      for(int i = 0;i < n ;i++)
      {
        l[i] = in.nextInt();
      }
       func(l ,n);
    }
   public static void func(int l[] , int n)
  {
    for(int i = 0 ;i < n-1 ;i++)
    {
      for(int j = i+1 ;j < n ;j++)
      {
         for(int k = j+1 ;k < n ;k++)
         {
          System.out.print("(" +l[i] +"," +" " +l[j] +"," +" " +l[k] +")" +" ");
        }
    }
      System.out.println();
    }
   }
}