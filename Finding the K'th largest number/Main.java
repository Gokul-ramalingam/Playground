import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int v = in.nextInt();
      int l[] = new int[v];
      int n[] = new int[v];
      int temp = 0;
      for(int i = 0 ;i < v ; i++)
      {
       l[i] = in.nextInt(); 
      }
      int k = in.nextInt();   
      for(int i = 0 ;i < v ; i++)
      {
          for(int j = 0 ;j < v ; j++)
          {
            if(l[i] > l[j])
            {
              temp = l[j];
              l[j] = l[i];
              l[i] = temp;
            }
          }
        } 

       System.out.print(l[k-1] +" ");
    }   
}