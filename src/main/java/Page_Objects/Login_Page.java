package Page_Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page 
{
	
	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By makeAppointment= By.xpath("/html/body/header/div/a");	
	By userName= By.id("txt-username");	 
	By password= By.id("txt-password");	
	By Loginbtn= By.id("btn-login");
	
	
	
	public void makeAppointmentButton()
	{		
		driver.findElement(makeAppointment).click();
	}
	
	public void userNameTbox(String usrname)
	{		
		driver.findElement(userName).sendKeys(usrname);
		
	}
	
	public void passwordTbox(String passwrd)
	{		
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public void LoginButton()
	{
		driver.findElement(Loginbtn).click();

	}

}
