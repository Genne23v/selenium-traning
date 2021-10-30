import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/zakk2/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/autocomplete");

		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
		//Thread.sleep(1000);  REMOVED throws interruptedException as well
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  IMPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 10);


		WebElement autocompleteResult = wait.until.(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item"));
		autocompleteResult.click();

		driver.quit();
	}
}
