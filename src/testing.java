import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\hayan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
	
		List<WebElement> myListOptions = driver.findElements(By.tagName("option"));
		
		for(int i = 0; i<myListOptions.size();i++) {
			
			System.out.println(myListOptions.get(i).getText());
		}
		
		
		

	}

}
