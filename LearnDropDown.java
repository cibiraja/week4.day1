package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryselect=new Select(industryDropdown);
		industryselect.selectByValue("IND_SOFTWARE");
		List<WebElement>industryDropDownOptions=industryselect.getOptions();
		 for (WebElement Option : industryDropDownOptions) 
		 {
		        System.out.println(Option.getText());
		 }
		 WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select ownershipselect = new Select(ownershipDropdown);
         ownershipselect.selectByIndex(ownershipselect.getOptions().size()-1);
         WebElement generalDropDown=driver.findElement(By.id("createLeadForm_generalStateProvidenceGeo"));
         Select stateselect=new Select(generalDropDown);
         stateselect.selectByIndex(2);
         driver.findElement(By.className("smallSubmit")).click();
	}
         
         
         
         
         
         
         
		    
		 
		 
		    
		 
		
		
		
		
		
		    
		
	}


