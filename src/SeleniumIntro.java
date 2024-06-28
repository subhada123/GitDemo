import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro {

	public static void main(String[] args) {
		
		// invoking browser
		//System.out.println("Hello");
		
		//Chrome - class ChromeBrowser -> Methods close get
		//FireFox - class FireFoxBrowser -> Methods close get
		//Webdriver is an interface here - methods close get
		/* Interface enforces the contract to class to follow */
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/SubhadaDange/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		
	}

}
