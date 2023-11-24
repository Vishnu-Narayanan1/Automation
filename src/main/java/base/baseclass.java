package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class baseclass {
	public static WebDriver driver;
		@BeforeTest
		public void setUp() {
			driver=new EdgeDriver();
			driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		}

	}


