import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	
	public static void main(String[] args){
	    // type your code here
      Scanner in = new Scanner(System.in);
      String string1 = in.nextLine();
      String string2 = in.nextLine();
      Pattern p = Pattern.compile("[0-9]{3}.[0-9]{2}.[0-9]{1,3}.[0-9]{1,3}");
      Matcher m = p.matcher(string1);
      System.out.println(string1 +" is valid? "+m.matches());
      Pattern p1 = Pattern.compile("[0-9]{1,2}/[0-9]{1}/[0-9]{4}");
      Matcher m1 = p1.matcher(string2);
      System.out.println("Is "+string2 +" a valid date format? "+m1.matches());
    }
}