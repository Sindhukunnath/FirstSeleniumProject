package twitterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class twitLandingpage {
	WebDriver driver;
	
	public twitLandingpage(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id='page-container']/div[2]/div[1]/div/div[2]/span/a/span")
	public WebElement profile;
	@FindBy(xpath="//*[@id='page-container']/div[1]/div[1]/div/div[3]/ul/li[1]/a/span[2]")
	public WebElement tweets;
	@FindBy(xpath="//*[@id='page-container']/div[1]/div[1]/div/div[3]/ul/li[2]/a/span[2]")
	public WebElement following;
	@FindBy(xpath="//*[@id='page-container']/div[1]/div[1]/div/div[3]/ul/li[3]/a/span[2]")
	public WebElement followers;
	
	public twitMyProfile gotoProfile(){
		profile.click();
		return PageFactory.initElements(driver, twitMyProfile.class);
	}
	
	public void gototweets(){
	tweets.click();
	}

	public void gotofollowing(){
	following.click();
	}
	
	public void gotofollowers(){
	followers.click();
	}
	

}
