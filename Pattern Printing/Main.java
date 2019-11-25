import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int column = in.nextInt();
      int balance = row;
      for(int i = row; i > 0 ;i--)
      {
        int temp = balance - i;
         int k = balance;
        for(int j = 0; j < column;j++)
        {  
          if(temp> 0)
          {
          System.out.print(k);
          k--;
          temp--;
          }
          else
          {
           System.out.print(i); 
          }
        }
        System.out.println();
      }
    }
}