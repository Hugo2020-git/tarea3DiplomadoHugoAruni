package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome implements  IBrowser {
    @Override
    public WebDriver create() {
        String driverPath="D:\\DOCUMENTOS\\DIPLOMADO_TESTING_UCB\\LECCIONES\\4_AUTOMATIZACION_MOVIL\\UCBRepositorios\\tarea3Diplomado\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
