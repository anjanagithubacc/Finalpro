package Pagepkg;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lumapag {
	WebDriver d;
public Lumapag(WebDriver d) {
	this.d=d;
	PageFactory.initElements(d,this);
	
}
@FindBy(xpath = "/html/body/div[2]/header/div/div/ul/li[2]/a")
WebElement signin;
@FindBy (xpath = "/html/body/div[2]/div[2]/div/div[3]")
WebElement clse;
@FindBy (xpath = "//input[@id='email']")
WebElement username;
@FindBy (xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
WebElement password;
@FindBy (name = "send")
WebElement lbutton;

@FindBy (xpath = "//*[@id='ui-id-4']")
WebElement women;
@FindBy (xpath = "//*[@id='ui-id-9']")
WebElement top;
@FindBy (xpath = "//*[@id='ui-id-11']")
WebElement jacket;

@FindBy (xpath ="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")
WebElement firston;
@FindBy (xpath = "//*[@id='option-label-size-143-item-166']")
WebElement size;
@FindBy (xpath = "//*[@id=\"option-label-color-93-item-57\"]")
WebElement clr;
@FindBy (xpath = "//div[@class='products wrapper grid products-grid']//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")
WebElement cartbutton;

@FindBy (xpath = "/html/body/div[2]/header/div[2]/div/a/span[2]")
WebElement cart;
@FindBy(xpath = "//span[normalize-space()='View and Edit Cart']")
WebElement viewedit;

@FindBy (xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")
WebElement check;
@FindBy (xpath = "/html/body/div[2]/div[2]/div/div[3]")
WebElement can;
@FindBy (xpath = "//div[@class='panel header']//button[@type='button']")
WebElement ddwn;
@FindBy (xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
WebElement signout;


public void sign()
{
	clse.click();
	signin.click();
	
	
	

}
public void passvalues(String uname,String pswd)
{
	clse.click();
	username.sendKeys(uname);
	password.sendKeys(pswd);

}
public void login()
{
	lbutton.click();
}
public void clearvalues() {
	username.clear();
	password.clear();
}
public void purchase()
{

	Actions act=new Actions(d);
	act.moveToElement(women);
	act.perform();
	act.moveToElement(top);
	act.perform();
	jacket.click();
	
}
public void scrollpage()
{
	JavascriptExecutor js=(JavascriptExecutor)d;
	js.executeScript("window.scrollBy(0,400)", "");
}
public void myordr()
{
	
	Actions a=new Actions(d);
	a.moveToElement(firston).perform();
	size.click();
	clr.click();
	cartbutton.click();
	
}
public void scrolluppage()
{
	JavascriptExecutor js=(JavascriptExecutor)d;
	js.executeScript("window.scrollBy(0,-400)", "");
}
public void cartbutton()
{

	cart.click();
	viewedit.click();
}
public void del()
{

	check.click();
	System.out.println("Cartpage:"+d.getCurrentUrl());
	d.navigate().back();
}
public  void logout()
{

	//WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
	d.navigate().to("https://magento.softwaretestingboard.com/");
	ddwn.click();
	signout.click();
	System.out.println("SIGNOUT");
}
}
