public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers obj1 = new Customers(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakme Kajal,Salwar");
      
      Customers obj2 = new Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
      
      Suppliers obj3 = new Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75);
      
      Suppliers obj4 = new Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35);
      obj1.display();
      obj2.display();
      obj3.display();
      obj4.display();
      obj1.editAddress();
      obj3.editAddress();
      obj1.placeOrder();
      obj3.increaseStockLevel(5); 
      obj4.increaseStockLevel(10);
      obj1.displayProfileDetails(obj1);  
      obj2.displayProfileDetails(obj2);
      obj3.displayProfileDetails(obj3);
      obj4.displayProfileDetails(obj4);
    }	
}

class Users {
		//write the logic for the class Users	
  int id;
  String name;
  long mobileNumber;
  
}

class Customers extends Users{
		//write the logic for the class Customers
  String shippingAddress;
  String dateOfBirth;
  char gender;
  String orderHistory;
  public Customers(int id,String name,long mobileNumber,String shippingAddress,String dateOfBirth,char gender,String orderHistory)
  {
    this.id = id;
    this.name =name;
    this.mobileNumber = mobileNumber;
    this.shippingAddress = shippingAddress;
    this.dateOfBirth = dateOfBirth ;
     this.gender = gender ;
  this.orderHistory =orderHistory;
  }
  public void display()
  {
    System.out.println(name+","+" "+mobileNumber);
  }
  public void editAddress()
  {
    System.out.println(name+","+" "+shippingAddress);
    this.shippingAddress = "Coimbatore";
    System.out.println(name+","+" "+shippingAddress);
  }
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
  public void displayProfileDetails(Customers obj)
  {
    
  }
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  String billingAddress;
  int itemsStock;
  String paymentStatus;
  double feedbackRating;
  public Suppliers(int id,String name,long mobileNumber,String billingAddress,int itemsStock,String paymentStatus, double feedbackRating)
  {
    this.id = id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.billingAddress = billingAddress;
    this.itemsStock = itemsStock;
    this.paymentStatus = paymentStatus;
    this.feedbackRating = feedbackRating;
  }
  public void display()
  {
    System.out.println(name+","+" "+mobileNumber);
  }
  public void editAddress()
  {
    System.out.println(name+","+" "+billingAddress);
    this.billingAddress = "Delhi";
    System.out.println(name+","+" "+billingAddress);
  }
  public void increaseStockLevel(int stock)
  {
    this.itemsStock = this.itemsStock + stock;
    System.out.println(name+","+" "+itemsStock);
  }
  public void displayProfileDetails(Suppliers obj)
  {
    
  }
}



