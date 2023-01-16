package Test_Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Objects.Login_Page;
import Page_Objects.MakeAppointmentPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookAnAppointment_test 
{
	static WebDriver driver;

	public static String BrowserType ="chrome";
	public static String testUrl ="https://katalon-demo-cura.herokuapp.com/";
	
	//@BeforeTest
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(testUrl);
		driver.manage().window().maximize();
	}
	
	@Test (groups = {"mainTest"})
	public static void LogINTestRunner1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(testUrl);
		driver.manage().window().maximize();
		Login_Page lg = new Login_Page(driver);		
		lg.makeAppointmentButton();
		lg.userNameTbox("John Doe");
		lg.passwordTbox("ThisIsNotAPassword");
		lg.LoginButton();	
	}
	
	@Test(groups = {"appointmentTest2"})
	public static void appointmentTest1() throws InterruptedException
	{
		Thread.sleep(5000);
		MakeAppointmentPage apt = new MakeAppointmentPage(driver);
		apt.combo_facilityDropdown();
		apt.chk_hospotal_readmissionChkBox();
		apt.radio_program_noneRdBtn();
		apt.txt_visit_date("17/01/2023");
		apt.txt_commentTbox("General_CheckUp");
		apt.btn_book_appointmentBtn();
	}
	
	
	@Test(groups = {"appointmentTest2"})
	public static void appointmentTest2() throws InterruptedException
	{
		Thread.sleep(5000);
		MakeAppointmentPage apt = new MakeAppointmentPage(driver);
		apt.Go_to_HomepageBtn();

		apt.combo_facilityDropdown();
		apt.chk_hospotal_readmissionChkBox();
		apt.radio_program_noneRdBtn();
		apt.txt_visit_date("17/01/2023");
		apt.txt_commentTbox("General_CheckUp");
		apt.btn_book_appointmentBtn();
		Thread.sleep(5000);

		driver.quit();
	}
	
	@Test (groups = {"appointmentTest3"})
	public static void appointmentTest3() throws InterruptedException
	{
		Thread.sleep(5000);
		MakeAppointmentPage apt = new MakeAppointmentPage(driver);
		apt.combo_facilityDropdown();
		apt.chk_hospotal_readmissionChkBox();
		apt.radio_program_noneRdBtn();
		apt.txt_visit_date("17/01/2023");
		apt.txt_commentTbox("General_CheckUp");
		apt.btn_book_appointmentBtn();
		Thread.sleep(5000);

		driver.quit();
	}
	//@AfterTest
	public static void closeBrowser() throws InterruptedException
	{
				
	}
}
