package elements;

import org.openqa.selenium.By;

public class ByTextLink implements IBy
{
    private String _textLink;

    public ByTextLink(String textLink)
    {
        this._textLink = textLink;
    }

    public By GetValue()
    {
        return By.linkText(this._textLink);
    }
}