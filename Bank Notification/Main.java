import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //write your logic here
      Scanner in = new Scanner(System.in);
      String bankName = in.nextLine();
      int type = in.nextInt();
      Details obj = new Details();
      switch(type){
        case 1:
          System.out.println(bankName+"-"+obj.notificationBySms());
          break;
        case 2:
          System.out.println(bankName+"-"+obj.notificationByEmail());
          break;
        case 3:
          System.out.println(bankName+"-"+obj.notificationByCourier());
          break;
        default:
          System.out.println(bankName+"-"+"Enter a valid notification type");
    }
}
}
interface Notification
{
 public String notificationBySms();
 public String notificationByEmail();
 public String notificationByCourier();
}
class Details implements Notification
{
   public String notificationBySms()
   {
    return "Notification by SMS";
   }
   public String notificationByEmail()
   {
    return "Notification by Mail";
   }
   public String notificationByCourier()
   {
    return "Notification by Courier";
   }
}
