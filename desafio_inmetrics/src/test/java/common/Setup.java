package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Setup {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void getBrowserProperty() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void initDriver(String baseUrl) {
		getBrowserProperty();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	public static void closeDriver() {

		driver.quit();
		driver = null;
	}
}