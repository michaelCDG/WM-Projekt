import java.util.ArrayList;

public class Gruppe
{
    private String name;
    private ArrayList<Mannschaft> mannschaften;
    private ArrayList<Spiel> spiele;
    
    public Gruppe(String tmpName)
    {
        name = tmpName;
        ArrayList<Mannschaft> mannschaften = new ArrayList();
    }
    
    public String gibName()
    {
        return name;
    }
    
    public ArrayList<Mannschaft> gibMannschaften()
    {
        return mannschaften;
    }
    
    public ArrayList<Spiel> gibAlleSpiele()
    {
        return spiele;
    }
    
    public void mannschaftHinzufuegen(Mannschaft mannschaft)
    {
        mannschaften.add(mannschaft);
    }
}