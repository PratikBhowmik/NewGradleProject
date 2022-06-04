package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Insta {
    private WebDriver driver;

    public void launch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("handled");
        }
    }

    public void loginToInsta() {
        try {
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("impratikbhowmik@gmail.com");
            driver.findElement(By.name("password")).sendKeys("Patrick@12oct2020");
            driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Handled");
            }
            driver.findElement(By.xpath("//button[@class='sqdOP yWX7d    y3zKF     ']")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Handled");
            }
            driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Hey check your element locator again");
        }
    }

    public void likeApost() {

    }

    public void closeBrowser() {
        driver.quit();
    }
}
