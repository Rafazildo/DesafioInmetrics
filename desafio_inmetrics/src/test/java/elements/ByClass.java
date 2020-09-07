package elements;

import org.openqa.selenium.By;

public class ByClass implements IBy
{
    private String _className;

    public ByClass(String className)
    {
        this._className = className;
    }

    public By GetValue()
    {
        return By.className(this._className);
    }
}

