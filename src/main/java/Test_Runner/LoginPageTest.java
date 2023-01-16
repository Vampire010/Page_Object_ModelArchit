package Test_Runner;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import Page_Objects.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest 
{
	static WebDriver driver;

	public static String BrowserType ="chrome";
	public static String testUrl ="https://katalon-demo-cura.herokuapp.com/";
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(testUrl);
		driver.manage().window().maximize();

		Login_Page lg = new Login_Page(driver);
		
		lg.makeAppointmentButton();
		lg.userNameTbox("John Doe");

		lg.passwordTbox("ThisIsNotAPassword");
		Thread.sleep(3000);

		lg.LoginButton();	
		
		Thread.sleep(3000);
		driver.quit();		
	}
}
