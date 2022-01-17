package DemoA.HybridFrameworkFacebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethods {
	public static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kalpe/eclipse-workspace/SeleniumConcepts/Driver1/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	public static void input_Username(String firstName) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(firstName);
	}

	public static void input_Password(String password) {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}

	public static void click_Login() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
