package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class SecondTestCase {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nop-station.com/");
		
		String tt = driver.getTitle();
		if(tt.equals("nopCommerece demo store")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Fail");
		}
		
		driver.close();
		
	}

}
