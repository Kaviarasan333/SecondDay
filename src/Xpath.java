import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roger\\eclipse-workspace\\ThirdDayXpath\\Driver\\chromedrivers.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement txt = driver.findElement(By.xpath("//div[contains(@class,'_8e63 _ihd _3ma mbs _6n _6s _6v')]"));
String text = txt.getText();
System.out.println(text);
}
}
