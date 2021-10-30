import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement{
	public static void main(String[] args){
		System.setProperty("webdriver.crhome.driver", "/Users/zakk2/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/scroll");

		WebElement name = driver.findElement(By.id("name"));
		Actions actions = new Actions(driver);
		actions.moveToElement(name);
		name.sendKeys("Meaghan Lewise");

		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("01/01/2020");

		driver.quit();
	}
}
