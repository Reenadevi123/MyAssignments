package homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps_Create_Lead {

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
		driver.findElement(By.name("companyName")).sendKeys("QA sol");
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("Reena");
		driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys("Devi");
		driver.findElement(By.xpath("//button[text()='Create Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Lead")) {
			System.out.println("title verification passed");
			
		}
		else {
			System.out.println("Title verification failed");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
