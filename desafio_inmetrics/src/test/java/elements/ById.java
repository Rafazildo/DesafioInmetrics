package elements;

import org.openqa.selenium.By;

public class ById implements IBy
{
    private String _id;

    public ById(String id)
    {
        this._id = id;
    }

    public By GetValue()
    {
        return By.id(this._id);
    }
}
