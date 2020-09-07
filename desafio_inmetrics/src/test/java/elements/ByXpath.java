package elements;

import org.openqa.selenium.By;

public class ByXpath implements IBy
{
    private String _xpath;

    public ByXpath(String xpath)
    {
        this._xpath = xpath;
    }

    public By GetValue()
    {
        return By.xpath(this._xpath);
    }
}
