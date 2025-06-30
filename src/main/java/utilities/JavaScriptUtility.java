package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{

    public static void scrollToElementJS(By locator){
        WebElement element = driver.findElement(locator); // locate the element
        String jsScript = "arguments[0].scrollIntoView();"; // JS to scroll
        ((JavascriptExecutor)driver).executeScript(jsScript, element); // execute JS
    }
}
