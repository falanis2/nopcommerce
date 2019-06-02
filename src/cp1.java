import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cp1 {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fernando Alanis\\Documents\\jar_files\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        WebDriver browser;
        //browser = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com//");
        WebElement email=driver.findElement(By.linkText("Register"));
        email.click();

    }}
