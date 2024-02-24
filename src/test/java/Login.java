import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\barko\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println(driver.manage().getCookies().size());
        driver.manage().deleteAllCookies();
        System.out.println(driver.manage().getCookies().size());
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
