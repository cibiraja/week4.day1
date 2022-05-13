package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stock market")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<String> securitynamelist=new ArrayList<String>();
		WebElement table2=driver.findElement(By.xpath("\\table[@class='table table-bordered table-condensed table-striped']\\"));
		List<WebElement>rowvalues=table2.findElements(By.xpath("//tr"));
		for(int i=1; i<=rowvalues.size()-1; i++)
		{
			WebElement findElement=rowvalues.get(i).findElement(By.xpath("//th["+i+"]"));
			if(findElement.getText().equals("Security Name"))
			{
				for(int j=1; j<=rowvalues.size()-1;j++)
				{
					String securitynameval=table2.findElement(By.xpath("//tr["+j+"]//td["+i+"]")).getText();
					securitynamelist.add(securitynameval);
				}
				
				System.out.println("securitynamelist" );
				System.out.println("securityname");
			    Set<String> set=new LinkedHashSet<String>();
			    if(set.size()<securitynamelist.size()) {
			    	System.out.println("The duplicates elements are:" + set);
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
				
				}
			}
			
		}
		
			
		}
				
		
		
		
        
		

		
		
		
		
		
		
	}
		


