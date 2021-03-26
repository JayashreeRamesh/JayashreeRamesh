package week2.homeassignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		// Select training programme using Index

		WebElement training = driver.findElement(By.id("dropdown1"));

		Select trainingDropdown = new Select(training);

		trainingDropdown.selectByIndex(2);

		// Select training programme using Text

		WebElement trainingprogramme = driver.findElement(By.name("dropdown2"));

		Select trainingprogDropdown = new Select(trainingprogramme);

		trainingprogDropdown.selectByVisibleText("Loadrunner");

		// Select training programme using value

		WebElement trainprogramme = driver.findElement(By.id("dropdown3"));

		Select trainprogDropdown = new Select(trainprogramme);

		trainprogDropdown.selectByValue("3");

		// Get the number of dropdowns

		WebElement numberofdd = driver.findElement(By.className("dropdown"));

		Select noofentries = new Select(numberofdd);

		List<WebElement> noofoptions = noofentries.getOptions();

		System.out.println(noofoptions.size());

		// use sendKeys to select

		WebElement sendkeysOption = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]"));
		sendkeysOption.sendKeys("Selenium");
		
		// Select Programmes

		WebElement selectProg = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]"));
		Select multiplevalues = new Select(selectProg);
		if (multiplevalues.isMultiple()) {
			multiplevalues.selectByIndex(1);
			multiplevalues.selectByIndex(2);
			multiplevalues.selectByIndex(3);
			multiplevalues.selectByIndex(4);
			
		}
		
		

	}

}
