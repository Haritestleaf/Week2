package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("hari@gmail.com");
		driver.findElement(By.xpath("//input[@value = 'Append ']")).sendKeys("Text \t");
		WebElement findElement = driver.findElement(By.name("username"));
		String getText = findElement.getAttribute("value");
		System.out.println("Text is :" + getText);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		WebElement findElement2 = driver.findElement(By.xpath("//input[@disabled='true']"));

		if (findElement2.isEnabled())
			System.out.println("Field is enable");
		else
			System.out.println("Field is not enable");
	}
}