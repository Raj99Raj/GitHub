package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="pass")
	private WebElement pass;

	@FindBy(xpath="//button[.='Log In']")
	private WebElement loginbt;
	
	public  Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setem(String un)
	{
		email.sendKeys(un);
	}
	public void setps(String pd)
	{
		pass.sendKeys(pd);
	}
	
	public void clickl()
	{
		loginbt.click();
	}
	
}
