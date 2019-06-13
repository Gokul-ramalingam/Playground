import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
     int o = in.nextInt();
     int t = in.nextInt(); 
     int h = in.nextInt();
     int a = great(o , t , h);
      System.out.println(a);
	}
  public static int great(int a , int b , int c){
    int temp = 0;
    if(a > b)
    {
      temp = a;
    }
    else
    {
       temp = b;
    }
    if(temp > c)
    {
      temp = temp;
    }
    else
    {
      temp = c;
    }
    return temp;
}
}
