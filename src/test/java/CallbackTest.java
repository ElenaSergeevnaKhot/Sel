import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class CallbackTest {
    private WebDriver driver;



    @BeforeAll
    static void setUpAll() {
        System.setProperty("driver.chrome.driver", "drivers/win/chromedriver.exe");
    }
    @BeforeEach
    void setUp() { driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void shouldTestSomething() {
        throw new UnsupportedOperationException();
    }
    driver.get("http://0.0.0.0:9999");
    WebElement form = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
    form.findElement(By.cssSelector("[data-test-id=name] input")). sendKeys("Elena");
    form.findElement(By.cssSelector("[data-test-id=phone] input")). sendKeys("+79810000000");
    form.findElement(By.cssSelector("[data-test-id=agreement] input")). click();
    form.findElement(By.cssSelector("[data-test-id=submit] input")). click();
    String text = driver.findElement(By.className("alert-success")).getText();
    assertEquals(expected " Ваша заявка успешно отправлена!", text);


    Thread.sleep(5000);
    ChromeOptions options = new ChromeOptions();
    ChromeOptions options = new ChromeOptions();
}
