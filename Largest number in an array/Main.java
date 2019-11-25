import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] =new int[n];
      for(int i = 0;i < n;i++)
        ar[i] = in.nextInt();
      int l = 0;
      for(int i = 0;i < n;i++)
      {
          if(ar[i]>l)
            l=ar[i];
      }
      System.out.println(l);
    }
}