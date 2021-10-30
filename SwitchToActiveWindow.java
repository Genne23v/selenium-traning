import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SwitchToActiveWindow{
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/Users/zakk2/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/switch-window");

		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();

		String originalHandle = driver.getWindowHandle();

		for (String handle1: driver.getWindowHandles()){
			driver.switchTo().window(handle1);
		}
		driver.switchTo().window(originalHandle);
		//driver.switchTo().frame("frameName"); or driver.switchTo().alert();

		driver.quit();
	}
}
