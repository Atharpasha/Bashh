package pom;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Three_tier_pom {
	
	public WebDriver driver;

	@FindBy(xpath="//input[@id='usernmae']")
	private WebElement username; 
	@FindBy(xpath="//input[@id='inputPassword']")
	private WebElement password; 
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement login; 
	@FindBy(xpath="//a[text()='Projects']")
	private WebElement clickonproject; 
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createproject; 
	@FindBy(xpath="//input[@name='projectName']")
	private WebElement projectname;
	@FindBy(xpath="//input[@name='teamSize']")
	private WebElement teamsize;
	@FindBy(xpath="//input[@name='createdBy']")
	private WebElement createdy;
	@FindBy(xpath="(//select[@name='status'])[2]")
	private WebElement dropdown;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public WebElement getClickonproject() {
		return clickonproject;
	}
	public void setClickonproject(WebElement clickonproject) {
		this.clickonproject = clickonproject;
	}
	public WebElement getCreateproject() {
		return createproject;
	}
	public void setCreateproject(WebElement createproject) {
		this.createproject = createproject;
	}
	public WebElement getProjectname() {
		return projectname;
	}
	public void setProjectname(WebElement projectname) {
		this.projectname = projectname;
	}
	public WebElement getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(WebElement teamsize) {
		this.teamsize = teamsize;
	}
	public WebElement getCreatedy() {
		return createdy;
	}
	public void setCreatedy(WebElement createdy) {
		this.createdy = createdy;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public void setDropdown(WebElement dropdown) {
		this.dropdown = dropdown;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	public Three_tier_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws InterruptedException
	{
		username.sendKeys("rmgyantra");;
		password.sendKeys("rmgy@9999");
		login.click();
		Thread.sleep(3000);
		clickonproject.click();
	}
	String name;
	public void createProject(WebDriver driver,String name)
	{
		
		createproject.click();
		projectname.sendKeys(name);
		//teamsize.sendKeys("100");
		createdy.sendKeys("SundarPichai");
		 Select sc=new Select(dropdown);
	     sc.selectByValue("Created");
	     submit.click();
	     
	}
	
}
