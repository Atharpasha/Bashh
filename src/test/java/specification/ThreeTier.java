package specification;

import static io.restassured.RestAssured.when;

import java.sql.SQLException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtitity.BaseClass;
import genericUtitity.DataBaseAPI;
import genericUtitity.EndPointLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import junit.framework.Assert;
import pom.Three_tier_pom;

public class ThreeTier extends BaseClass {
	@Test
	public void threeTier1() throws InterruptedException, SQLException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://rmgtestingserver:8084/");
		String name="GoogleChat"+jlib.getRandom();
		Three_tier_pom obj=new Three_tier_pom(driver);
		obj.login();
		obj.createProject(driver,name);  
		String projectId = driver.findElement(By.xpath("//td[.='"+name+"']/preceding-sibling::td")).getText();
		Response res = when().get("http://rmgtestingserver:8084"+EndPointLibrary.getSingleproject+projectId);
		System.out.println(res.then().log().all());
		String actdata = dlib.executeAndGet("select * from project;", 1,projectId);
		Assert.assertEquals(actdata, projectId);
	
	}
	@Test
	public void threeTier2() throws InterruptedException, SQLException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		Thread.sleep(3000);
		Three_tier_pom obj=new Three_tier_pom(driver);
		obj.login();
	}
	@Test
	public void threeTier3()
	{
		
		
		
	}

}
