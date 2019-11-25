import java.util.*;
public class Main<T> 
{ 
  // type your code here
    public T printt(T t)
    {
     return t;
    }
  public static void main(String[] args) 
     { 
       // type your code here
       Main<Integer> m = new Main<Integer>();
       Main<String> n = new Main<String>();
       Main<Float> o = new Main<Float>();
       Scanner in = new Scanner(System.in);
       int i = in.nextInt();
      
       in.nextLine();
       String j = in.nextLine();
       Float k = in.nextFloat();
        System.out.println("Integer Value: "+m.printt(new Integer(i)));
        System.out.println("String Value: "+n.printt(new String(j)));
        System.out.println("Float value: "+o.printt(new Float(k)));
     }
 }