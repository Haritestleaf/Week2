package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement element = driver.findElement(By.id("position"));
		Point Location = element.getLocation();
		int X = Location.getX();
		int Y = Location.getY();
		System.out.println("Position of X is " + X + " , Y is "+ Y);
		WebElement colour = driver.findElement(By.id("color"));
		String colourName =  colour.getAttribute("style");
		System.out.println("Colour is " + colourName);
		WebElement Size = driver.findElement(By.id("size"));
		int P = Size.getSize().getHeight();
		int Q = Size.getSize().getWidth();
		System.out.println("Height is " + P + " , Width is " + Q );
		
	}

}
