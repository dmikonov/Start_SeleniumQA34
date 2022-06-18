import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        wd = new ChromeDriver();
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.close();
       // wd.quit();
    }

    @Test
    public void firstTest() {
        wd = new ChromeDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("d020797@gmail.com");

        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Ww12345$");

        WebElement loginButton = wd.findElement(By.cssSelector("button"));
        loginButton.click();
    }

    @Test
    public void HomeworkRegistration(){
        wd = new ChromeDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("d020797@yjjj0ho.com");

        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Ww12345$");

        WebElement registrationButton = wd.findElement(By.cssSelector("div.login_login__3EHKB :last-child"));
        registrationButton.click();

        wd.quit();
    }
}
