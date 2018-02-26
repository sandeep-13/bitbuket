package selenium_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class footer_links {

	
	public static void main(String[] args) {
		FirefoxDriver chippa=new FirefoxDriver();
		chippa.get("http://www.bing.com/");
		WebElement footer=chippa.findElement(By.id("sb_foot"));
		List<WebElement>links=footer.findElements(By.tagName("a"));
		System.out.println(footer.getText());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		
		
		

	}

}
