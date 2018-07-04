import java.util.ArrayList;
import java.util.Iterator;

public class Spiel
{
    private Mannschaft heimmannschaft;
    private Mannschaft gastmannschaft;
    private String datum;
    private String ort;
    private byte heimtore;
    private byte gasttore;
    
    public Spiel(Mannschaft tmpHeimmannschaft, Mannschaft tmpGastmannschaft, String tmpDatum, String tmpOrt)
    {
        heimmannschaft = tmpHeimmannschaft;
        gastmannschaft = tmpGastmannschaft;
        datum = tmpDatum;
        ort = tmpOrt;
    }
    
    private Mannschaft gibHeimmannschaft()
    {
        return heimmannschaft;
    }
    
    private Mannschaft gibGastmannschaft()
    {
        return gastmannschaft;
    }
    
    private String gibDatum()
    {
        return datum;
    }
    
        public void addTorHeim()
    {
        heimtore++;
    }
    
    public void addTorGast()
    {
        gasttore++;
    }
    
    private String gibOrt()
    {
        return ort;
    }
    
    public int gibToreHeim()
    {
        return heimtore;
    }
    
    public int gibToreGast()
    {
        return gasttore;
    }
}
