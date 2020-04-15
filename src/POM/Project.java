package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Projects')]")
	private WebElement projects;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div/div/div/a[2]")
	private WebElement addnewProject;

	@FindBy(xpath = "//select[@name='client_id']")
	private WebElement selectClient;

	@FindBy(xpath = "//input[@name='project_name']")
	private WebElement projectName;

	@FindBy(xpath = "//select[@name='billing_method']")
	private WebElement billingMethod;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[4]/div/div[1]/textarea")
	private WebElement internalnotes;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/select")
	private WebElement teamMember;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
	private WebElement submitBtn2;

	public Project(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setProject(String project_name, String notes) throws IOException, InterruptedException {
		Thread.sleep(1000);
		projects.click();
		Thread.sleep(2000);
		addnewProject.click();
		Thread.sleep(1000);

		Select s = new Select(selectClient);
		s.selectByVisibleText("vaushnavi");
		Thread.sleep(1000);

		projectName.sendKeys(project_name);
		
		Thread.sleep(1000);

		Select s2 = new Select(billingMethod);
		s2.selectByVisibleText("Hourly project rate");
		
		Thread.sleep(1000);

		internalnotes.sendKeys(notes);
		Thread.sleep(1000);

		Select s3 = new Select(teamMember);
		s3.selectByVisibleText("vaishnavi ak");
		
		Thread.sleep(2000);

		submitBtn2.click();

	}

}



