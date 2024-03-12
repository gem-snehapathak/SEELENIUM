import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        js.executeScript("window.scroll(0,3000)");

        Thread.sleep(3000);

        driver.quit();

    }


}