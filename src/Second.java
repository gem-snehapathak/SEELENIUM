import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("mobile");
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
//        js.executeScript("window.scroll(0,3000)");


        driver.quit();

    }
}
