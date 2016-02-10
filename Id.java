
/**
 * 
 * Permet d'obtenir l'id d'un usager ou admin
 * Utilisse la classe Base_donnee
 * Est utilissee par les classes : Administrateur et Usager
 */
public class Id
{
    // instance variables - replace the example below with your own
    private int Id;
    private Base_donnee base_donnee;
    /**
     * Constructor for objects of class Id
     */
    public Id()
    {
        base_donnee = new Base_donnee();
    }
    
        /**
     * Getter pour la BD
     * 
     * @param  base_donnee.
     */
    public Base_donnee getBD(Base_donnee base_donnee)
    {
        return base_donnee;
    }
    
    /**
     * Setter pour la BD.
     * 
     * @param  Base de donnee.
     */
    public void setBD(Base_donnee base_donnee)
    {
        this.base_donnee = base_donnee;
    }
}
