package regressionTestPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@SuppressWarnings("unused")
public class MarkAttendance {
WebDriver driver;	

By Coursename=By.xpath("//*[@id=\"navbar\"]/ul[1]/li[2]/a");
By Selectcourse=By.xpath("//*[@id=\"page\"]/div/div[3]/div/div/div[2]/h4/a");
By NewAtt=By.id("istooldesc_26256");
By sem1=By.linkText("sem1");
By drop=By.xpath("//*[@id=\"filter\"]/fieldset/div[2]/div/button/div/div/div");
By all=By.xpath("//*[@id=\"filter\"]/fieldset/div[2]/div/div/div[2]/ul/li[1]/a");
By unmark1=By.xpath("//*[@id=\"cm-content\"]/div/form/div[1]/div[2]/div/table/tbody/tr[1]/td/div/input");
By unmark2=By.xpath("//*[@id=\"cm-content\"]/div/form/div[1]/div[2]/div/table/tbody/tr[2]/td/div/input");
By unmark3=By.xpath("//*[@id=\"cm-content\"]/div/form/div[1]/div[2]/div/table/tbody/tr[3]/td/div/input");
By unmark4=By.xpath("//*[@id=\"cm-content\"]/div/form/div[1]/div[2]/div/table/tbody/tr[4]/td/div/input");
By lockicon=By.xpath("/html/body/main/section/div/form/div[1]/div[2]/div/table/thead/tr[3]/th/div/span/img");
By save=By.cssSelector("#cm-content > div > form > div.row > div > button");
By view= By.id("cm-content");
By Alist=By.xpath("//*[@id=\"cm-content\"]/div/ul/li");


//creating parameterized constructor to initialize WebDriver reference
public MarkAttendance(WebDriver driver)
{
	this.driver =driver;
}

public void markattendance()
{
	driver.findElement(Coursename).click();
	driver.findElement(Selectcourse).click();
	driver.findElement(NewAtt).click();
	driver.findElement(sem1).click();
	driver.findElement(drop).click();
	driver.findElement(all).click();
	driver.findElement(unmark1).click();
	driver.findElement(save).click();
	driver.findElement(lockicon).click();
	//driver.findElement(unmark2).click();
	//driver.findElement(unmark3).click();
	driver.findElement(unmark4).click();
	driver.findElement(save).click();
	driver.findElement(view).click();
	driver.findElement(Alist);
}

public boolean success_markattendance()
{
    boolean regsuccess1=driver.findElement(view).isDisplayed();
	return regsuccess1;
}

public String get_attendancename() {
	return driver.findElement(Alist).getText();
}

}
