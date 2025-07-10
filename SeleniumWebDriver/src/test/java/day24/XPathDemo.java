package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("T-shirts");

		//Xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='q'][@autocomplete='off']")).sendKeys("T-shirts");
		
		//Xpath with and operator
		//driver.findElement(By.xpath("//input[@name='q' and @autocomplete='off']")).sendKeys("T-shirts");
		
		//Xpath with or operator
		//driver.findElement(By.xpath("//input[@name='q' or @autocomplete='f']")).sendKeys("T-shirts");
		
		//xpath with text() - inner text
		//driver.findElement(By.xpath("//a[text()='Cart']")).click();
		//driver.findElement(By.xpath("//*[text()='Cart']")).click();
		
		/*boolean displaystatus = driver.findElement(By.xpath("//div[text()='Best of Electronics']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value = driver.findElement(By.xpath("//div[text()='Best of Electronics']")).getText();
		System.out.println(value);
		*/
		//xpath with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("T-shirts");
		
		//xpath with start-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("T-shirts");
		
		//chained xpath
		boolean status = driver.findElement(By.xpath("//a[@title='Flipkart']/picture/img")).isDisplayed();
		System.out.println(status);
	}

}
