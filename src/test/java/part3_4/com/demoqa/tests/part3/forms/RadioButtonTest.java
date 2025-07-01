package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
        var formPage = homePage.goToForms().clickPracticeForm();
        formPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected,
                "\nFemale radio button is not selected");
    }
}
