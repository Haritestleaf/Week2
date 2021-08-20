package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/28/98");	 
		 WebElement findElement = driver.findElement(By.id("createLeadForm_currencyUomId"));
		 Select drpdwm = new Select(findElement); 
		 drpdwm.selectByVisibleText("INR - Indian Rupee");
		 driver.findElement(By.name("submitButton")).click();
		 String title= driver.getTitle();
		 String hometitle = "View Lead | opentaps CRM";
		 if(title.equals(hometitle))
			 System.out.println(" It is a home page");
		 
		 else
		 {
			 System.out.println("its not");
		 }
		 }


	}


