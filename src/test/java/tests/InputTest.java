package tests;

import org.junit.jupiter.api.Test;
import pages.InputPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTest extends Base{
InputPage inputPage;

    @Test
    public void  openInputBlock() {
        inputPage = new InputPage(driver);
        inputPage.clickInputBlock();
        assertEquals(inputPage.checkTextInputWithLabelTitle(), "Text Input");

    }
}
