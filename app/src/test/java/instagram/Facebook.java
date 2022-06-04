package instagram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
    private WebDriver driver;
    private Alert al;

    public void launchFacebook() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        try {
            driver.findElement(By.name("email")).sendKeys("impratikbhowmik@gmail.com");
            driver.findElement(By.name("pass")).sendKeys("Patrick@12oct2020");
            driver.findElement(By.name("login")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found");
        }
        try {
            al = driver.switchTo().alert();
            al.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Alert exception handled");
        }

    }

    public void likeApost() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
        } catch (JavascriptException e) {
            System.out.println("Exception handled");
        }
    }
}
