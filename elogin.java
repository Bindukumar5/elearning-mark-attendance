package regressionTestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 //This class will store all the locators and methods of Login page
 
public class elogin {
WebDriver driver;	

By username= By.id("login");
By password = By.id("password");
By loginstatus = By.xpath("//*[@id=\"cm-content\"]/div/ul/li");
By loginbutton = By.id("form-login_submitAuth");

By footerText = By.xpath("//*[contains(text(),'Administrator')]");

By SignUpBotton=By.linkText("Sign up!");
//creating parameterized constructor to initialize WebDriver reference
public elogin(WebDriver driver)
{
	this.driver =driver;
}


public void typeusername(String s)
{
	driver.findElement(username).sendKeys(s);
}


public void typepassword(String p) {
	driver.findElement(password).sendKeys(p);
}

public boolean isUsernameboxAvailable()
{

	if (driver.findElement(username).isDisplayed()) {
		return true;
	}
	else
	{
		return false;
	}
	
	}
public boolean isUsernameboxEnabled()
{

	if (driver.findElement(username).isEnabled()) {
		return true;
	}
	else
	{
		return false;
	}
	
	}

public boolean isPasswordboxEnabled()
{

	if (driver.findElement(password).isEnabled()) {
		return true;
	}
	else
	{
		return false;
	}
	
	}


public void clickLoginButton()
{
	driver.findElement(loginbutton).click();
}

public String getLoginStatus()
{
	return driver.findElement(loginstatus).getText();
}


public String getFooterString()
{
	String footerString;
	try {
		footerString=driver.findElement(footerText).getText();
	}
	catch(NoSuchElementException e)
	{
		footerString="Not found";
	}
	return footerString;
}

public boolean isFooterFound()
{
	boolean found=false;
	try {
		
		found=driver.findElement(footerText).isDisplayed();
	}
	
	catch (NoSuchElementException e)
	{
		found=false;
	}
	
	return found;
	
}
public void clickSignUp()
{
	driver.findElement(SignUpBotton).click();
}



}