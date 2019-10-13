package AT_lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class App
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ozon.ru");
        WebElement element = driver.findElement(By.xpath("//button[@value='Каталог']"));
        element.click();
        Actions action = new Actions(driver);
        WebElement element1 = driver.findElement(By.xpath("//span[contains(text(), 'Книги')]"));
        action.moveToElement(element1).build().perform();
        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(), 'Компьютерные технологии')]"));
        element2.click();
        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(), 'Бестселлеры')]"));
        element3.click();


        //element.sendKeys("Hello World!");
        //element.sendKeys(Keys.ENTER);


    }
}
