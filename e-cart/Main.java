//import required packages here
import java.util.Scanner;
class Item 
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price)
  {  
    this.price = price;
  }  
  public int getPrice()
  {
     return price; 
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product)
  {
    this.product = product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }
  public String getProduct()
  {
    return this.product;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  public int billPrice(int x, int y)
  {
   int billAmt = x*y;
   return billAmt;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    c.setProduct(a);
    int z = in.nextInt();
    i.setPrice(z);
    int x = i.getPrice(); 
    int b = in.nextInt();
    c.setQuantity(b);
    int y = c.getQuantity();
     System.out.println("Total Price is : "+obj.billPrice(x,y));
  }
}