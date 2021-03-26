package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Jayashree");
		driver.findElement(By.id("lastNameField")).sendKeys("Ramesh");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jay");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Shree");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is to create a new contact with the given details");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jay@gmail.com");
	
		
		//Selecting the state/Province name from the drop down using visible text
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateDropDown = new Select(state);
		stateDropDown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is an important note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
		System.out.println("Title of the page:" + title);
	
	

	}

}
