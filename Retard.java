
/**
 * 
 * Permet d'obtenir automatiquement le retard des film et averti l'utillisateur
 * Utilisse la classe Amende
 * Est utilissee par les classes : Reservation
 */

public class Retard
{
    private int retard;
    private int nombreJourReserve; 
    private int nombreJourGarder;
    private String messageRetard;
    private Amende amende;
    
    /**
     * Constructor for objects of class reservation
     */
    public Retard()
    {
        amende = new Amende();
    }
    
    /**
     * retard des films reserves
     * 
     * @param int nombreJourReserve 
     * @param int nombreJourGarder
     * @return int nombreJourRetard   
     */
    public int retard(int nombreJourReserve,int nombreJourGarder)
    {
      return 0;  
    }
    
    /**
     * Averti l'utillisateur d'un retard
     * 
     * @param int nombreJourReserve 
     * @param int nombreJourGarder
     * 
     */
    public void retard(int nombreJourReserve,int nombreJourGarder,String messageRetard)
    {
        
    }
    
    /**
     * Getter pour les amendes.
     * 
     * @param  amende
     */
    public Amende getAmende(Amende amende)
    {
        return amende;
    }
    
    /**
     * Setter pour les amendes.
     * 
     * @param  amende
     */
    public void setAmende(Amende amende)
    {
        this.amende = amende;
    }
}
