import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Form {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/Users/zakk2/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/form");

		FormPage formPage = new FormPage();
		formPage.submitForm(driver);

		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);

		assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

		driver.quit();
	}
}
