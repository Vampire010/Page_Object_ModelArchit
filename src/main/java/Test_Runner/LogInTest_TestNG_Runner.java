package Test_Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Page_Objects.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTest_TestNG_Runner 
{

	static WebDriver driver;

	public static String BrowserType ="chrome";
	public static String testUrl ="https://katalon-demo-cura.herokuapp.com/";
	
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(testUrl);
		driver.manage().window().maximize();
	}
	
	
	//@Test
	public static void LogINTestRunner1() throws InterruptedException
	{
		Login_Page lg = new Login_Page(driver);
		
		lg.makeAppointmentButton();
		lg.userNameTbox("John Doe");

		lg.passwordTbox("ThisIsNotAPassword");
		lg.LoginButton();	
		driver.quit();		
	}
	
	@Test
	public static void LogINTestRunner2() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(testUrl);
		driver.manage().window().maximize();

		Login_Page lg = new Login_Page(driver);
		
		lg.makeAppointmentButton();
		lg.userNameTbox("John Doe");

		lg.passwordTbox("ThisIsNotAPassword");
		lg.LoginButton();	
		driver.quit();		

	}
	
	public static void closeBrowser()
	{
	}
}
