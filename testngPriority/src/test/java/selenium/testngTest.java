package selenium;


import org.testng.annotations.Test;

public class testngTest {

  @Test(priority=0)
  public void reg() {
	  
	  System.out.println("Registerd Successfully");
  }
  
  @Test(priority=1)
  public void login() {
	   
	  System.out.println("Login Successfully");
  }
  
  @Test(priority=2)
  public void order() {
	   
	  System.out.println("Ordered Successfully");
  }
  
  @Test(priority=3)
  public void booking() {
	   
	  System.out.println("Booked Successfully");
  }
  
  @Test(priority=4)
  public void close() {
	   
	  System.out.println("Close Application");
  }
    
}
