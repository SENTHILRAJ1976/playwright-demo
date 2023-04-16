package week3.day4;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelection {

	public static void main(String[] args) {


ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']//span[contains(text(), 'for boys')]")).click();

			
				
		List<WebElement> findEle = driver.findElements(By.xpath("//div/span/a/div/img"));
		int count = findEle.size();
		System.out.println("The total number of bags count is "+count);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		/*
		 * driver.findElement(By.
		 * xpath("(//i[@class='a-icon a-icon-extender-expand']//following-sibling::span[@class='a-expander-prompt'])[1]"
		 * )).click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 */
	 driver.findElement(By.xpath("//li[@id='p_89/American Tourister']/span/a/div/label/i")).click();

		
		 driver.findElement(By.xpath("//li[@id='p_89/Skybags']/span/a/div/label/i")).click();

	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
		List<WebElement> findEle1 = driver.findElements(By.xpath("//span[contains(text(), 'New Season')]"));
		
		List<String> getCount = new ArrayList<String>();
		
		for(WebElement ele: findEle1) {
			getCount.add(ele.getText());
			}
	
		Collections.sort(getCount);
			
		System.out.println(getCount);
				
		int newSeasonCount = findEle1.size();
		
		System.out.println("The total number of New Season count "+newSeasonCount);

		
		WebElement ele = driver.findElement(By.xpath("(//div[1]/div[2]/h5/span)[1]"));
		
		String text = ele.getText();
		
		WebElement ele1 = driver.findElement(By.xpath("(//a/span[1]/span[2]/span[@class='a-price-whole'])[1]"));
		
		String text2 = ele1.getText();
		
		System.out.println("The Product name and prizes are: "+text+" "+text2);

		
		driver.close();

		
		
	}

}
