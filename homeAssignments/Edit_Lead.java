package homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/.");
			driver.manage().window().maximize();

			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("QA solutions");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Reena");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("devi");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("ree");
			driver.findElement(By.name("departmentName")).sendKeys("automation");
			driver.findElement(By.name("description")).sendKeys("testing");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ree@gmail.com");
			Select options=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
			options.selectByVisibleText("New York");
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		    driver.findElement(By.xpath("//a[text()='Edit']")).click();
		    WebElement box=driver.findElement(By.name("description"));
		    box.clear();
		    driver.findElement(By.name("importantNote")).sendKeys("This is for testing");
		    driver.findElement(By.name("submitButton")).click();
		    String title=driver.getTitle();
		    System.out.println(title);
		    driver.close();
		    
		}
		
	}





