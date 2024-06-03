package homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps_Create_account {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3000, long);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/accountsMain']")).click();
		driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("Test Account");
		driver.findElement(By.name("primaryPhoneAreaCode")).sendKeys("647");
		driver.findElement(By.name("primaryEmail")).sendKeys("ramalingamreenadevi@gmail.com");
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Reena");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("25");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Account")){
			System.out.println("title verification passed");
		}
		else {
			System.out.println("title verification failed");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
