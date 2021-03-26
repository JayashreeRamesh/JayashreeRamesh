package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.xpath("//span[text()= 'Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("jay@gmail.com");
		driver.findElement(By.xpath("//button[text() = 'Find Contacts']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//table[@class ='x-grid3-row-table']//tr[1]/td[1]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).click();
		driver.findElement(By.id("viewContact_firstName_sp")).getText();
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		
		//Select New Marketing Campaign as eCommerce Site Internal Campaign by using SelectByValue
		
		WebElement marketCamp = driver.findElement(By.id("addMarketingCampaignForm_marketingCampaignId"));
		Select marketCampDropDown = new Select (marketCamp);
		marketCampDropDown.selectByValue("9000");
		
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		
		
		driver.findElement(By.id("updateContactForm_departmentName")).clear();
		driver.findElement(By.id("updateContactForm_departmentName")).sendKeys("Selenium Automation Testing");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		driver.findElement(By.id("viewContact_marketingCampaigns_sp")).getText();
		
		String title = driver.getTitle();
		System.out.println("Title of the page:" + title);
		

	}

}
