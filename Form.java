import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Form {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/Users/zakk2/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/form");

		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		driver.findElmenet(By.id("job-title")).sendKeys("QA Engineer");

		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.cssSelector("option[value='1']").click();
		driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN); 
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

		driver.quit();
	}
}
