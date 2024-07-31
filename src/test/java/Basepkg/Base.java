package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
	public WebDriver d;
	@BeforeTest
	public void start()
	{
		d=new ChromeDriver();
		d.get("https://magento.softwaretestingboard.com/");
		d.manage().window().maximize();
	}


}
