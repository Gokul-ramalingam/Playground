import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine();
    String str3 = in.nextLine();
    String sb = str;
    String sb1 = str1 ;
    String sb3 = str3 ;
      if(sb.contains(sb1) == true)
      {
        System.out.print(sb.replace(sb1,sb3));
      }
    }
}