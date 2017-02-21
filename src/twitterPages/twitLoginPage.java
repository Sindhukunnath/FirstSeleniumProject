package twitterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class twitLoginPage {
	
	WebDriver driver;

	
	public twitLoginPage(WebDriver driver){
		this.driver = driver;
	}
	@FindBy(xpath="//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input")
	public WebElement username; 
	@FindBy(how=How.XPATH, using="//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input")
	public WebElement password; 
	
	@FindBy(xpath="//*[@id='page-container']/div/div[1]/form/div[2]/button")
	public WebElement login; 
	
	public twitLandingpage DoLogin(String myusername, String mypassword){
		
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		login.click();
		return PageFactory.initElements(driver, twitLandingpage.class);
	
		
	

		
		
		
	}

}
