package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    private final By practiceFormMenuItem = By.xpath("//*[@id='item-0']//*[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm(){
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
