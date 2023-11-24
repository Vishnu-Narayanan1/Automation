package page;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Urbanmonkeypage {
	WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"gh-ac\"]")
		WebElement clk1;
		@FindBy(xpath="//*[@id=\"gh-ac\"]")
		WebElement productname1;
		@FindBy(xpath="//*[@id=\"gh-btn\"]")
		WebElement clk2;
		@FindBy(xpath="//*[@id=\"item424ec06dd6\"]/div/div[2]/a")
		WebElement clk3;
		@FindBy(xpath="//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a")
		WebElement clk4;
		@FindBy(xpath="//*[@id=\"gh-shop-a\"]")
		WebElement clk5;
		@FindBy(xpath="//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/ul[1]/li[2]/a")
		WebElement clk6;
		@FindBy(xpath="//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-4-list\"]/li[2]/a/p")
		WebElement clk7;
		@FindBy(xpath="//*[@id=\"s0-28-9-0-1[0]-0-0-4-list\"]/li[2]/a/p")
		WebElement clk8;
		@FindBy(xpath="//*[@id=\"s0-28-9-0-1[0]-0-1[1]-0-4-list\"]/li[1]/a/p")
		WebElement clk9;
		@FindBy(xpath="//*[@id=\"s0-28_2-9-0-1[0]-0-0-6-4\"]/div[1]/div[1]/div/ul/li[3]/a/h2")
		WebElement clk10;
		@FindBy(xpath="//*[@id=\"s0-28_1-9-0-1[0]-0-0\"]/ul/li[1]/div[1]/div[2]/a/h3")
		WebElement clk11;
		@FindBy(xpath="//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")
		WebElement clk12;
		@FindBy(xpath="//*[@id=\"gh-la\"]")
		WebElement clk13;
		@FindBy(xpath="//*[@id=\"gh-minicart-hover\"]/div/a[1]")
		WebElement clk14;
		@FindBy(xpath="//*[@id=\"mainContent\"]/div/div[3]/div[1]/div[1]/div[1]/ul/li/div/div/div/div[2]/span[2]/button")
		WebElement clk15;
		@FindBy(xpath="//*[@id=\"gh-p-3\"]/a")
		WebElement clk16;
		@FindBy(xpath="//*[@id=\"sr-input\"]")
		WebElement clk17;
		@FindBy(xpath="//*[@id=\"sr-input\"]")
		WebElement feedback;
		@FindBy(xpath="//*[@id=\"sr-action\"]")
		WebElement clk18;
		@FindBy(xpath="//*[@id=\"itemList\"]/ul/li[1]/a")
		WebElement clk19;
		@FindBy(xpath="/html/body/div[5]/div[2]/div[1]/div[1]/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div[2]")
		WebElement clk20;
		
		public Urbanmonkeypage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void searchClick() {
			clk1.click();

		}
		public void setValues(String product) {
			productname1.sendKeys(product);
		}
		public void searchClick1() {
			clk2.click();
			
			
		}
		public void productclick() {
			clk3.click();
			
		}
		public void cartclick()throws Exception{
			Thread.sleep(1000);
			clk4.click();
		}
		public void mainclk() {
			clk5.click();
			clk6.click();
			clk7.click();
			clk8.click();
			clk9.click();
			clk10.click();
			
		}
		public void ballclk(){
			clk11.click();
			
		}
		public void cartball()throws Exception {
			Thread.sleep(1000);
			clk12.click();
		}
		public void  backhome() {
			clk13.click();
		}
		public void dltcart() {
			clk14.click();
			clk15.click();
		}
		public void help() {
			clk16.click();
			clk17.click();
			
		}
		public void Feedback(String feedbck) {
			feedback.sendKeys(feedbck);
		}
		public void searchbtn() {
			clk18.click();
			clk19.click();
		
		}
		public void like() {
			clk20.click();
		}
}
