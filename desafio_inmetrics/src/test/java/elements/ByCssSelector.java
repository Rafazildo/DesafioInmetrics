package elements;

import org.openqa.selenium.By;

public class ByCssSelector implements IBy
{
    private String _cssSelector;

    public ByCssSelector(String cssSelector)
    {
        this._cssSelector = cssSelector;
    }

    public By GetValue()
    {
        return By.cssSelector(this._cssSelector);
    }
}
