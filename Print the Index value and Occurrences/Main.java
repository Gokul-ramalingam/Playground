import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner in = new Scanner(System.in);
      String in1 = in.nextLine();     
      String in2 = in.nextLine();
      Pattern p = Pattern.compile(in1);
      Matcher m = p.matcher(in2);
      if(m.find())
      {
        Matcher z = p.matcher(in2);
        int i = 0;
        while(z.find())
        {
          i++;
          System.out.println("found: "+i +" : "+z.start()+" - "+z.end());
        }
        System.out.println(i);
      }
      else
      {
        System.out.println("The given word is not present in the string");
      }
    }
}