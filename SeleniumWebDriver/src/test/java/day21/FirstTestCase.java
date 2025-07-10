package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		String act_title=driver.getTitle();
		if(act_title.equals("Your store"))
			{
			System.out.println("Test passed");
			}
		else{
			System.out.println("Test failed");
		}
		
		driver.close();	}

}
