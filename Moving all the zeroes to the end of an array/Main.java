import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      for(int i = 0;i < n;i++)
        ar[i] = in.nextInt();
      int cnt = 0;
      for(int i = 0;i < n;i++)
        if(ar[i] == 0)
          cnt++;
      int idx = 0;
       for(int i = 0;i < n;i++)
       {
        if(ar[i] != 0)
        {
        ar[idx] = ar[i];
        idx++;
        }
       }
      for(int i = idx;i < n;i++)
      {
        ar[i] = 0;
      }
      for(int i = 0;i < n;i++)
      {
        System.out.print(ar[i]+" ");
      }
    }
}