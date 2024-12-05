import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
        
System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver-win64\\chromedriver.exe");

WebDriver driver=new ChromeDriver(options);
JavascriptExecutor js=(JavascriptExecutor)driver;
driver.get("https://www.paruvendu.fr/");
js.executeScript("cmp_pv.cookie.saveConsent(true);");
driver.navigate().refresh();
driver.findElement(By.partialLinkText("Déposer une annonce gratuite")).click();
Select categ =  new Select(driver.findElement(By.id("choixFamille1")));
categ.selectByVisibleText("Voiture d'occasion");
}
}
