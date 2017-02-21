import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twittertestlocal {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://twitter.com/login");
		WebElement username= driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input"));
		username.sendKeys("sindhuhcom");
		WebElement password=driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input"));
		password.sendKeys("test123");
		WebElement login= driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/div[2]/button"));
		login.click();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement myname= driver.findElement(By.xpath("//*[@id='page-container']/div[2]/div[1]/div/div[2]/span/a"));
		myname.click();
		
		//profile edit button
		WebElement edit_button=driver.findElement(By.xpath("//*[@id='page-container']/div[4]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[5]/div/button/span"));
		edit_button.click();
	
		//change pic
		WebElement photo_icon=driver.findElement(By.xpath("//*[@id='page-container']/div[4]/div/div[1]/div[2]/button/div[1]/span"));
		photo_icon.click();
		//upload photo
		WebElement upload_photo=driver.findElement(By.xpath("//*[@id='header-choose-existing']/div/div/label/input"));
		upload_photo.sendKeys("C:\\download.jpg");
		WebElement cancel_photo=driver.findElement(By.xpath("//*[@id='header_image_upload_dialog-dialog']/div[2]/div[2]/div/div/div/div[3]/button[1]"));
		cancel_photo.click();
		//cancel header
		WebElement cancel_header=driver.findElement(By.xpath("//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[5]/div/div/button[2]"));
		cancel_header.click();
		
		
		
		
		
		
	}

}
