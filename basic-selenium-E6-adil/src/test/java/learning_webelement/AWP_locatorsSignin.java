package learning_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_locatorsSignin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("admin");

		Thread.sleep(1000);

		email.clear();

		Thread.sleep(1000);

		email.sendKeys("username_123");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]"));
//		login.click();
		login.submit();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
