package Test_Runner;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataSource.DataEnginr;
import Page_Objects.Login_Page;
import Page_Objects.MakeAppointmentPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTUserLoginTest 
{
	static WebDriver driver;

	public static String BrowserType ="chrome";
	public static String testUrl ="https://katalon-demo-cura.herokuapp.com/";
	
	@BeforeTest
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(testUrl);
		driver.manage().window().maximize();
	}
	@Test
	public static void LogINTestRunner1() throws InterruptedException, IOException
	{
		DataEnginr DataEng =  new DataEnginr();
		String usrName = DataEng.getdata("UserLogInCred", 1, 0);
		String password = DataEng.getdata("UserLogInCred", 1, 1);
		Login_Page lg = new Login_Page(driver);
		lg.makeAppointmentButton();
		lg.userNameTbox(usrName);
		lg.passwordTbox(password);
		lg.LoginButton();			
	}
	

	@AfterTest
	public static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
