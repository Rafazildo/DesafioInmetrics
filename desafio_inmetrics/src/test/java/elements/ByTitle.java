package elements;

import org.openqa.selenium.By;

public class ByTitle implements IBy
{
    private String _title;

    public ByTitle(String title)
    {
        this._title = title;
    }

    public By GetValue()
    {
        return By.xpath("//*[contains(@title , '" + this._title + "')]");
    }
}
