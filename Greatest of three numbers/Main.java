import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int max = 0;
      if(num1>num2)
        max = num1;
      else
        max = num2;
      if(max>num3)
        System.out.println(max);
      else
        System.out.println(num3);
    }
}