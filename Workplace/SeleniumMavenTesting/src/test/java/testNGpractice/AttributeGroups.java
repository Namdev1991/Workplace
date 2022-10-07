package testNGpractice;

import org.testng.annotations.Test;

public class AttributeGroups {
	@Test(groups= {"software company"})
	 public void infosys()
	 {
	 System.out.println("Infosys");
	 }
	 @Test
	 public void technip()
	 {
	 System.out.println("Technip India Ltd");
	 }
	 @Test(groups= {"software company"})
	 public void wipro()
	 {
	 System.out.println("Wipro");
	 }
}
