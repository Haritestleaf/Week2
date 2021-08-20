package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement DrpDwn1 = driver.findElement(By.id("dropdown1"));
		Select Drp1= new Select(DrpDwn1);
		Drp1.selectByIndex(1);
		
		WebElement DrpDwn2 = driver.findElement(By.name("dropdown2"));
		Select Drp2= new Select(DrpDwn2);
		Drp2.selectByVisibleText("Selenium");
		
		WebElement DrpDwn3 = driver.findElement(By.id("dropdown3"));
		Select Drp3= new Select(DrpDwn3);
		Drp3.selectByValue("2");
		
		WebElement DrpDwn4 = driver.findElement(By.xpath("//Select[@class='dropdown']"));
		Select Drp4= new Select(DrpDwn4);
		int size = Drp4.getOptions().size();
		System.out.println(" size of dropdown is " + size );
		
		driver.findElement(By.xpath("(//section[@class='innerblock']//select)[5]")).sendKeys("Selenium");
		
		WebElement DrpDwn6 = driver.findElement(By.xpath("(//section[@class='innerblock']//select)[6]"));
		Select Drp6 = new Select(DrpDwn6);
		Drp6.selectByValue("1");
		
		
	}
	
	

}
