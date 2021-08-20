package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("hariharan");
		driver.findElement(By.name("UserLastName")).sendKeys("M");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9894593722");
		WebElement JobTitle = driver.findElement(By.name("UserTitle"));
		WebElement Employee = driver.findElement(By.name("CompanyEmployees"));
		Select Jobdrpdwn = new Select(JobTitle);
		Select Empdrpdwn = new Select(Employee);
		Jobdrpdwn.selectByVisibleText("Developer / Software Engineer / Analyst");
		Empdrpdwn.selectByValue("75");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
		

	}

}
