package JavaClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccountTest {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void myBeforeTest() {}
	
	
	@Test

		public void Login() throws InterruptedException {
	
			driver.get("https://magento.softwaretestingboard.com/");
		
	
			driver.findElement(By.partialLinkText("Create")).click();
			
			
			WebElement theForm = driver.findElement(By.id("form-validate"));
			List<WebElement> myinputFields = theForm.findElements(By.tagName("input"));
	
			System.out.println(myinputFields.size());
			
			for(int i=0; i<myinputFields.size(); i++) {
				
				if(myinputFields.get(i).getAttribute("type").equals("hidden")) {
					continue;
				}else {
				myinputFields.get(i).sendKeys("ahmad");
			  }
	       }
		}
		
	}
	


