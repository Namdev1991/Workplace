package testNGpractice;

import org.testng.annotations.Test;

public class AttributesDependOnMethods {
  @Test
   public void WebStudentLogin()
  {
   System.out.println("Student login through web");
  }
   @Test
   public void MobileStudentLogin()
  {
   System.out.println("Student login through mobile");
   }
   @Test(dependsOnMethods= {"WebStudentLogin","Checking"})
   public void APIStudentLogin()
   {
   System.out.println("Student login through API");
  }
   @Test
   public void Checking() {
	   System.out.println("Student Checking");
   }
}
