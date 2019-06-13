import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int switchCase =in.nextInt();
      int a = in.nextInt();
       switch(switchCase){
        case 1:
          System.out.print(a*a);
           break;
        case 2:
          System.out.print(a *(a+1));
           break;
        case 3:
         System.out.print((a*(a+1))/2);
           break;
        case 4:
           int b = a;
          System.out.print( 3.14 * b * b);
           break;
         default:
          System.out.println("Enter a valid switch case");
          break;
    }
}
}

 