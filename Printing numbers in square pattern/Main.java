import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      for(int i = 1; i <= number ;i++)
      {
        for(int j = 0;j < number ;j++)
        {
          System.out.print(i);
        }
        System.out.println("");
      }
	}
}