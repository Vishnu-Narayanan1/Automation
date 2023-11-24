package Test;



import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.baseclass;
import page.Urbanmonkeypage;


public class urbanmonkeytest extends baseclass{
		
		@Test
		public void test() throws Exception{
			Urbanmonkeypage ob=new Urbanmonkeypage(driver);
			ob.searchClick();
			ob.setValues("Apple iPhone 13 - 128GB 256GB 512GB - All Colors - Excellent Condition");
			ob.searchClick1();
			 //String parentWindow=driver.getWindowHandle();
			ob.productclick();
			String parentWindow=driver.getWindowHandle();
			Set<String> allWindowHandles=driver.getWindowHandles();
			for (String handle : allWindowHandles) {
	            if (!handle.equalsIgnoreCase(parentWindow)) {
	                driver.switchTo().window(handle);
	                ob.cartclick();
	               driver.close();        
		}
	            driver.switchTo().window(parentWindow);	
	            driver.navigate().refresh();
	            }
	
	ob.mainclk();
	 String parentWindow1=driver.getWindowHandle();
	 ob.ballclk();
		Set<String> allWindowHandles1=driver.getWindowHandles();
		for (String handle1 : allWindowHandles1) {
         if (!handle1.equalsIgnoreCase(parentWindow1)) {
             driver.switchTo().window(handle1);
	 ob.cartball();
	 driver.close();
		}
         driver.switchTo().window(parentWindow1);	
         driver.navigate().refresh();
         }
		ob.backhome();
		ob.dltcart();
		driver.navigate().back();
	 ob.help();
  ob.Feedback("Leaving feedback for buyers");
      ob.searchbtn();
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      ob.like();
      driver.navigate().back();
      driver.quit();

		}}
