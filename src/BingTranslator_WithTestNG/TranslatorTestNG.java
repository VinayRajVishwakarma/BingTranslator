package BingTranslator_WithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TranslatorTestNG {

	WebDriver driver;
	@BeforeClass
	public void test01(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayvishwakarma\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		driver.manage().window().maximize();
	}
	@Test
	public void test02(){
		WebElement selectTag1= driver.findElement(By.cssSelector("#t_sl"));					//Select language for input
		System.out.println("Test");
		
		for(int indexForDropDown1=25; indexForDropDown1<=28; indexForDropDown1++ ){
			driver.findElement(By.cssSelector("textarea#t_sv")).clear();
		selectTag1.findElement(By.cssSelector("select option:nth-of-type(1)")).click();
		
		WebElement selectTag2= driver.findElement(By.cssSelector("#t_tl"));					//Select language for output
		selectTag2.findElement(By.cssSelector("option:nth-of-type("+indexForDropDown1 +")")).click();
		
		driver.findElement(By.cssSelector("textarea#t_sv")).sendKeys("I love India.");		//input text here
		
		/*System.out.println("hi");*/			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//driver.findElement(By.cssSelector("a#t_revIcon.ttop_switch")).click();			//click on swap button
		}		
	}
	@Test
	public void test03(){
		driver.findElement(By.cssSelector("a#t_revIcon.ttop_switch")).click();			//click on swap button
		
	}
	
}
