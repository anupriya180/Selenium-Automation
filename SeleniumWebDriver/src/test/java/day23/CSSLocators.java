package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//tag id     tag#id
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("T-Shirts");
		
		//tag class   tag.classname
		//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("T-Shirt");
		//driver.findElement(By.cssSelector(".nav-input")).sendKeys("T-Shirt");
		
		//tag attribute   tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("T-shirts");
		
		//tag class attribute
		driver.findElement(By.cssSelector("input.nav-input[placeholder='Search Amazon.in']")).sendKeys("T-shirt");
	}

}
