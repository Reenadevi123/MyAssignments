package homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_account_creation {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.name("firstname")).sendKeys("Reena");
	driver.findElement(By.name("lastname")).sendKeys("devi");
	driver.findElement(By.name("reg_email__")).sendKeys("6474643826");
	driver.findElement(By.id("password_step_input")).sendKeys("Oraccle(3)");
	
	Select options=new Select(driver.findElement(By.id("month")));
	options.selectByValue("1");
	Select options2=new Select(driver.findElement(By.id("day")));
	options2.selectByVisibleText("10");
	Select options3=new Select(driver.findElement(By.id("year")));
	options3.selectByVisibleText("1987");
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	}

}
