package learning_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		WebElement username = driver.findElement(By.id("user_login_field"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("security_passphrase"));
		password.sendKeys("1234567");
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
