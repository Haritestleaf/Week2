package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Hariharan");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("9894593722");
		driver.findElement(By.id("password_step_input")).sendKeys("cV$2txus");
		WebElement DateOfBirth = driver.findElement(By.name("birthday_day"));
		Select drpdwn = new Select(DateOfBirth);
		drpdwn.selectByVisibleText("28");
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select drpdwn1 = new Select(month);
		Select drpdwn2 = new Select(year);
		drpdwn1.selectByValue("6");
		drpdwn2.selectByValue("1998");
		driver.findElement(By.xpath("//Label[text()='Male']")).click();
		String Url1 = driver.getCurrentUrl();
		String Url2 = "https://en-gb.facebook.com/";
		if(Url2.equals(Url1))
			System.out.println("It is correct");
		else
			System.out.println(" It is not");
	}

}
