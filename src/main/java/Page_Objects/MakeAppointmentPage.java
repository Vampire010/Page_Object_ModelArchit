package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentPage
{
	WebDriver driver;
	
	public MakeAppointmentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By combo_facility = By.xpath("//*[@id='combo_facility']");	
	By chk_hospotal_readmission= By.id("chk_hospotal_readmission");	 
	By radio_program_none= By.id("radio_program_none");	
	By txt_visit_date= By.id("txt_visit_date");
	By txt_comment= By.id("txt_comment");
	By btn_book_appointment= By.id("btn-book-appointment");
	
	By Go_to_Homepage= By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a");

	
	public void combo_facilityDropdown()
	{		
		driver.findElement(combo_facility).click();
		
		Select combo_facilityOption = new Select(driver.findElement(combo_facility));
		combo_facilityOption.selectByVisibleText("Hongkong CURA Healthcare Center");
	}
	
	public void chk_hospotal_readmissionChkBox()
	{		
		driver.findElement(chk_hospotal_readmission).click();
		
	}
	
	public void radio_program_noneRdBtn()
	{		
		driver.findElement(radio_program_none).click();
	}
	
	public void txt_visit_date(String visit_date)
	{
		driver.findElement(txt_visit_date).sendKeys(visit_date);
	}
	
	
	public void txt_commentTbox(String Comment)
	{		
		driver.findElement(txt_comment).sendKeys(Comment);
	}
	
	public void btn_book_appointmentBtn()
	{		
		driver.findElement(btn_book_appointment).click();
	}
	
	public void Go_to_HomepageBtn()
	{		
		driver.findElement(Go_to_Homepage).click();
		
	}
}
