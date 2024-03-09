package JavaClassPackage;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChooseItemTest {


	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void myfirstTest () {
		
		driver.manage().window().maximize();
	}



	@Test 
	public void mysecondTest() throws InterruptedException {
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement myListOfItems =  driver.findElement(By.xpath("//ol[@class='product-items widget-product-grid']"));
		
		List<WebElement> allItems = myListOfItems.findElements(By.tagName("li"));
		
		Random rand = new Random();
		int randomindex = rand.nextInt(allItems.size());
		
		
		
		
		for(int i=0; i<allItems.size(); i++) {
			allItems.get(randomindex).click();


			if(allItems.contains("swatch-attribute")) {
				allItems.get(randomindex).click();
				

			}
			else {
				driver.navigate().back();
				allItems.get(randomindex).click();
	  
	  }				
	}
  }

	
	

	@AfterTest
	public void AfterTesting() {

	}

}