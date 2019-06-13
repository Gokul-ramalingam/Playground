import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int sz = in.nextInt();
      int arr[] = new int[sz];
      int flag = 0;
      int fl = 0;
      for(int i = 0 ; i < sz ; i++)
      {
        arr[i] = in.nextInt();
      }
      int se = in.nextInt();
      int sr = in.nextInt();
      for(int i = 0 ; i < sz ; i++)
      {
        if(se == arr[i] )
        {
          System.out.println(i);
          flag = 1;
        }
         if(sr == arr[i] )
        {
          System.out.println(i);
           fl = 1;
        }
      }
       if(flag == 0)
       {
         System.out.println("-1");
       }
      if(fl == 0)
       {
         System.out.println("-1");
       }
    }
}