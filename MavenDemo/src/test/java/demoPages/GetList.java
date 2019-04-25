package demoPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GetList {

	// configure log4j properties file

	public WebDriver driver;

	@Test
	public void getListItem() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("hiiii");
		driver.get("https://www.tyremarket.com/Car-Tyres");

		driver.findElement(By.linkText("Car Tyres")).click();

		driver.findElement(By.xpath("//span[@id='select2-chosen-1']")).click();
		List<WebElement> vehicle_list = driver.findElements(By.xpath("//ul[@id='select2-results-1']//li"));

		for (WebElement vehicle_list_values : vehicle_list) {
			System.out.println(vehicle_list_values.getText());
		}

		driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).sendKeys("Mahindra", Keys.ENTER);

		Thread.sleep(2000);

		// span[@id='select2-chosen-2']

		// model
		driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).click();
		List<WebElement> model_list = driver.findElements(By.xpath("//ul[@id='select2-results-2']//li"));

		for (WebElement model_list1 : model_list) {
			System.out.println(model_list1.getText());
		}

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']")).sendKeys("Mahindra Bolero", Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@id='select2-chosen-3']")).click();
		List<WebElement> submodel_list = driver.findElements(By.xpath("//ul[@id='select2-results-3']//li"));

		for (WebElement submodel_list1 : submodel_list) {
			System.out.println(submodel_list1.getText());
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen3_search']")).sendKeys("Mahindra Bolero DI 4WD BSIII",Keys.ENTER);
		Thread.sleep(2000);

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
