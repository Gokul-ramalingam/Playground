import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code here
      Scanner in = new Scanner(System.in);
      String text = in.nextLine();
      String arr[] = text.split("and");
      for(String string1 : arr)
      {
        String arr1[] = string1.split("or");
        for(String string2 : arr1)
        {
          String arr2[] = string2.split(",");
          for(String string3 : arr2)
           {
              String arr3[] = string3.split(" ");
               for(String string4 : arr3)
               {
                 System.out.println(string4);
               }
           }
        }
      }
    }
}