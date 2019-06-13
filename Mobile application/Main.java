class MyModel1 {
     //write your logic here
  int pixels = 2;
  public MyModel1()
  {
    System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels:"+" "+pixels);
  }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  int pixels = 5;
  String lockType = "Fingerprint";
  int displaySize = 5;
  public MyModel2()
  {
    System.out.println("Features of MyModel 2");
    System.out.println("Camera mega pixels:"+" "+pixels);
    System.out.println("Lock mechanism: "+lockType);
    System.out.println("Display size: "+displaySize);
  }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  int pixels = 16;
  int displaySize = 6;
  public MyModel2T()
  {
    System.out.println("Features of MyModel 2T");
    System.out.println("Camera mega pixels:"+" "+pixels);
    System.out.println("Lock mechanism: "+lockType);
    System.out.println("Display size: "+displaySize);
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel2T obj1 = new MyModel2T();
      
    }
}