package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameaAndAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[contains(text(), 'Try it')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Senthil Raj");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text2);
	}

}
