package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("---------------------------------------------------");

		// Click the Alert (Simple Dialog)
		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement ele = driver.findElement(By.xpath("//span[@id='simple_result']"));
		String text2 = ele.getText();
		System.out.println(text2);
		System.out.println("---------------------------------------------------");
		
		Thread.sleep(3000);

		// Click the Confirmation Alert with OK option (Confirm Dialog)

		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@id='result']"));
		String text3 = ele1.getText();
		System.out.println(text3);
		Thread.sleep(3000);
		System.out.println("User Clicked : OK");

		// Click the Confirmation Alert with Cancel option (Confirm Dialog)
		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//span[@id='result']"));
		String text4 = ele2.getText();
		System.out.println(text4);
		System.out.println("---------------------------------------------------");
		Thread.sleep(3000);

		// Click the Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[3]")).click();

		WebElement txt = driver.findElement(
				By.xpath("//p[contains(text(), 'You have clicked and open a dialog that can be inspectable.')]"));
		String text5 = txt.getText();
		System.out.println(text5);
		System.out.println("---------------------------------------------------");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//button/span[contains(text(), 'Dismiss')])")).click();
		Thread.sleep(5000);

		// Click the Sweet Modal Dialog
		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[4]")).click();
		WebElement txt1 = driver.findElement(By.xpath(
				"//p[contains(text(), 'Unless you close this, you cannot interact with other element. But am inspectable !')]"));
		String text15 = txt1.getText();
		System.out.println(text15);
		System.out.println("---------------------------------------------------");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[1]/a/span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		Thread.sleep(3000);

		// Click the Alert with Click Yes (Prompt Dialog)
		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[5]")).click();
		Alert alert14 = driver.switchTo().alert();
		alert14.sendKeys("Senthil Raj");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String text12 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text12);
		Thread.sleep(3000);

		// Click the Alert with Click No (Prompt Dialog)
		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[5]")).click();
		Alert alert15 = driver.switchTo().alert();
		alert15.sendKeys("Senthil Raj");
		String text1 = alert.getText();
		System.out.println(text1);
		alert.dismiss();
		String text13 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text13);
		System.out.println("---------------------------------------------------");		
		Thread.sleep(5000);

		// Click the Sweet Alert with 'Yes' selection (Confirmation)
		driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();
		WebElement findElement = driver.findElement(By.xpath("//span[contains(text(), 'Are you sure you want to proceed?')]"));
		findElement.getText();
		driver.findElement(By.xpath("//span[contains(text(), 'Yes')]")).click();
		Thread.sleep(5000);

		// Click the Sweet Alert with 'No' selection (Confirmation)
		// driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();
		WebElement findElement1 = driver.findElement(By.xpath("//span[contains(text(), 'Are you sure you want to proceed?')]"));
		findElement1.getText();
		driver.findElement(By.xpath("//span[contains(text(), 'No')]")).click();
		Thread.sleep(3000);

		// Click the Minimize and Maximize
		driver.findElement(By.xpath("(//span[contains(text(), 'Show')])[6]")).click();
		Thread.sleep(2000);
		WebElement ele8 = driver.findElement(By.xpath("(//p[@class='m-0'])[2]"));
		String text9 = ele8.getText();
		System.out.println(text9);
		System.out.println("---------------------------------------------------");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']/div[1]/a[3]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']/div[1]/a[2]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']/div[1]/a[1]/span")).click();

		
		driver.close();
	}

}
