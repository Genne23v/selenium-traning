import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestSample {
	public static void main(String[] args){
		System.setProperty("webdirver.chrome.driver", "/Users/zakk2/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("Cheese!");

		element.submit();

		driver.quit();

	}
}
