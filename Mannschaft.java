import java.util.ArrayList;

public class Mannschaft
{
    private ArrayList<Spieler> spieler;
    private Trainer trainer;
    private String name;
    private String land;
    public Mannschaft(String tmpName, Trainer tmpTrainer, String tmpLand)
    {
        name = tmpName;
        trainer = tmpTrainer;
        land = tmpLand;
    }
    
    public String gibName()
    {
        return name;
    }
    
    public void setName(String tmpName)
    {
        name = tmpName;
    }
    
    public void setTrainer(Trainer tmpTrainer)
    {
        trainer = tmpTrainer;   
    }
    
        public Trainer trainer()
    {
        return trainer;
    }
    
    public ArrayList<Spieler> gibSpieler()
    {
        return spieler;
    }
    
    public void addSpieler(Spieler tmpSpieler)
    {
        spieler.add(tmpSpieler);
    }
}
