import java.io.*;
class Fibonacci extends Thread
{
  // type your code here
  Thread t = new Thread(this);
  int num = 0;
  public Fibonacci(int num)
  {
    this.num = num;
    System.out.print("The Fibonacci series is :");
    t.start();
  }
  
  public void run()
  {
      int t1 = 0 , t2 = 1 ;
     for(int i = 0; i < num; i++)
     {
       System.out.print(t1+" ");
       int sum = t1 + t2;
       t1 = t2;
       t2 = sum;
     }
  }
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the limit for Fibonacci: ");
       String in = "";
       try
       {
       in = br.readLine();
       }
       catch(IOException io)
       {
         System.out.println(io);
       }
       int limit = Integer.parseInt(in);
       System.out.println(limit);
       if(limit > 0)
       {
       Fibonacci fib = new Fibonacci(limit);
       }
       else
       {
         System.out.println("Exception occurred");
       }
     }
}