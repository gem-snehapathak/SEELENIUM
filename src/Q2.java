import graphql.Assert;
import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Books");
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement firstResult = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));

        if (firstResult.isDisplayed()) {

            String bookName = firstResult.getText();
            System.out.println("First book in search results: " + bookName);
        } else {
            System.out.println("Searched item not found.");
        }
        boolean isElementDisplayed = driver.findElement(By.xpath("//*[text()='Books' and @class='a-size-base a-color-base']")).isDisplayed();
        Assert.assertTrue(isElementDisplayed);
        if(isElementDisplayed){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        Thread.sleep(3000);
        driver.quit();


    }
}
