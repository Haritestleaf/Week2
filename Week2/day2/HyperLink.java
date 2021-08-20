package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.linkText("Go to Home Page"));
		String Home = findElement.getAttribute("href");
		findElement.click();
		driver.navigate().back();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		String Title1 = "HTTP Status 404 – Not Found";
		if(title.equals(Title1))
				System.out.println(" It is broken");
		else
			System.out.println(" It is not ");
		
		
		
	}

}
