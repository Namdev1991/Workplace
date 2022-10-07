package testNGpractice;

import org.testng.annotations.Test;

public class AtributePriority {
  @Test(priority=0)
  public void mango() {
	  System.out.println("Mango");
  }
  @Test(priority=0)
  public void grapes() {
	  System.out.println("Grapes");
  }
  @Test(priority=1)
  public void banana() {
	  System.out.println("Banana");
  }
  @Test(priority=2)
  public void Apple() {
	  System.out.println("Apple");
  }
}
