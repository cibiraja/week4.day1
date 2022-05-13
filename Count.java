package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Count {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		int tablecount=driver.findElements(By.xpath("(//table)")).size();
		System.out.println("total number of tables in the page is -" +tablecount);
		System.out.println("-------------------------------------------------");
		for(int i=1; i<=tablecount;i++)
		{
			int table1rowcount=driver.findElements(By.xpath("(//table)["+i+"]//tr")).size();
			System.out.println("the total number of rows in the table"+i+" is -" +table1rowcount);
			
			int table1colcount=driver.findElements(By.xpath("(//table)["+i+"]//th")).size();
			System.out.println("the total column in the table "+i+" is-"+ table1colcount);
			System.out.println("------------------------------------------------");
		}
		
	}

}
