package instagram;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Insta {
    private WebDriver driver;
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
    }
    public void loginToInsta(){
        try{
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("impratikbhowmik@gmail.com");
        }catch(NoSuchElementException e){
            System.out.println("Hey check your element locator again");
        }finally{
            System.out.println("LOL! why did you use finally block!");
        }
    }
    public void likeApost(){
        
    }
    public void closeBrowser(){
        driver.quit();
    }
}
