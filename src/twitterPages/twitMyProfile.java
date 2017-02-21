package twitterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class twitMyProfile {
	
	WebDriver driver;
	
	public twitMyProfile(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id='page-container']/div[4]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[5]/div/button/span")
	
	

	public WebElement editbutton;
	public twitEditProfile editProfile(){
		
		editbutton.click();
		return PageFactory.initElements(driver, twitEditProfile .class);
	}

}
