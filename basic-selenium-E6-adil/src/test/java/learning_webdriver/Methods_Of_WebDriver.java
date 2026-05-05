package learning_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Of_WebDriver {
	public static void main(String[] args) throws InterruptedException, MalformedURLException

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com"); // InvalidArgumentException

		String title = driver.getTitle();
		if (title.contains("Instagram")) System.out.println("Succesfully Reached");

		String url = driver.getCurrentUrl();
		if (url.contains("instagram")) System.out.println("Succesfully Reached");

//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);

//		Options opt = driver.manage();
//		driver.manage().window().minimize();
//
//		Thread.sleep(2000);
//
//		driver.manage().window().fullscreen();

//		getSize()
		
		Window win = driver.manage().window();
		
		Dimension dim1 = win.getSize();
		System.out.println(dim1);
		
		int h = dim1.getHeight();
		int w = dim1.getWidth();
		
		System.out.println(w + " and " + h);

//		setSize()
		win.setSize(new Dimension(500, 500));

//		getPosition
		Point pt = win.getPosition();
		System.out.println(pt);
		
		int x = pt.getX();
		int y = pt.getY();
		
		System.out.println(x);
		System.out.println(y);
		
//		setPosition
		win.setPosition(new Point(0, 0));
		
		System.out.println(win.getPosition());
		
		Navigation nav = driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		
		nav.to("https://www.google.com");
		
//		URL url1 = new URL("https://www.google.com");
//		nav.to(url1);
		
//		
//		driver.getWindowHandle();
//		
//		driver.getWindowHandles();
//		
//		driver.switchTo();

//		driver.close();

		Thread.sleep(2000);
		driver.quit();
	}
}
