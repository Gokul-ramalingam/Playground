import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]){
      // type your code here 
      Scanner in = new Scanner(System.in);
      String string1 = in.nextLine();
      String string2 = in.nextLine();
      String string3 = in.nextLine(); 
      Pattern p = Pattern.compile("[a-zA-z0-9_-]{4,15}");
      Matcher m = p.matcher(string1);
      System.out.println("Is "+string1+" a valid user name? "+m.matches());
      
    
      Pattern p1 = Pattern.compile("[a-z0-9_]{1,30}@{1}[a-z]{1,10}.{1}[a-z]{1,15}");
      Matcher m1 = p1.matcher(string2);
      System.out.println("Is "+string2+" a valid email address? "+m1.matches());
    
      
      Pattern p2 = Pattern.compile("[a-zA-Z0-9@#$%]{0,20}");
      Matcher m2 = p2.matcher(string3);
      System.out.println("Is "+string3+" a valid password? "+m2.matches());  
    }
}