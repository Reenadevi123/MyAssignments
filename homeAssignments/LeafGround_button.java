package homeAssignments;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.curve.Point;

public class LeafGround_button {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Dashboard")) {
		System.out.println("Title verification passed");
	}
	else {
		System.out.println("Title verification failed");
	}
	driver.navigate().back();

	WebElement button=driver.findElement(By.xpath("(//div[@class='card']/button)[1]"));
	if(button.isEnabled()) {
		System.out.println("The verification for the button:Confirm if the button is disabled is passed ");
	}
	else {
		System.out.println("The verification for the button:Confirm if the button is disabled is failed");
	}
	WebElement sub=driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']/following-sibling::span"));
	org.openqa.selenium.Point loc=sub.getLocation();
	System.out.println(loc);
    WebElement save=driver.findElement(By.xpath("//span[text()='Save']"));	
    String color= save.getCssValue("background-color");
    System.out.println(color);
    WebElement submit=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
    org.openqa.selenium.Dimension size=submit.getSize();
    System.out.println(size);
	
	}

	}


