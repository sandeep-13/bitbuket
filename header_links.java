package selenium_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class header_links {


	public static void main(String[] args) {
		FirefoxDriver chippa=new FirefoxDriver();
		chippa.get("http://www.bing.com/");
		WebElement header=chippa.findElement(By.id("sc_hdu"));
		List<WebElement> links=header.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		
		
		
		

	}
}


