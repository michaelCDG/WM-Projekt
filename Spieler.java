

public class Spieler{
    private String name;
    private int alter;
    private String geburtsdatum;
    private String position;
    
    public Spieler(String tmpName, int tmpAlter, String tmpGeburtsdatum, String tmpPosition){
        name = tmpName;
        alter = tmpAlter;
        geburtsdatum = tmpGeburtsdatum;
        position = tmpPosition;
    }
    
    public String gibName(){
        return name;
    }
    
    public int gibAlter(){
        return alter;
    }
    
    public String gibGeburtsdatum(){
        return geburtsdatum;
    }
    
    public String gibPosition(){
        return position;
    }
}

