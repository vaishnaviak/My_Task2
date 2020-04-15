package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Time_Tracking {
	

	

	@FindBy(xpath ="/html/body/div[3]/div/div[1]/div[2]/div[2]/div/ul/li[1]/a")
	private WebElement timeTracking;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/select")
	private WebElement selectProject;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/select")
	private WebElement selectTask;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/div[3]/div/input")
	private WebElement enterHours;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/div[4]/div/textarea")
	private WebElement notes;


	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/div[5]/button")
	private WebElement logTime;

	public Time_Tracking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setTime_Tracking(String projectName, String task,String hour,String note) throws IOException, InterruptedException {
		Thread.sleep(1000);
	    timeTracking.click();
	    Thread.sleep(2000);
	    Select s = new Select(selectProject);
		s.selectByVisibleText(projectName);
		Thread.sleep(1000);
		 Select s2 = new Select(selectTask);
		s2.selectByVisibleText(task);
		Thread.sleep(1000);
		enterHours.sendKeys(hour);
		Thread.sleep(1000);
		notes.sendKeys(note);
		Thread.sleep(1000);
		logTime.click();
		
		
		
		
		
	}

	
	
	
	
	
	

}



