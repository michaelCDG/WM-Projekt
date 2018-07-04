public class Trainer
{
    private String name;
    private int alter;

    public Trainer(int tmpAlter, String tmpName)
    {
        alter = tmpAlter;
        name = tmpName;
    }

    public int gibAlter()
    {
        return alter;
    }

    public String gibName()
    {
        return name;
    }


}
