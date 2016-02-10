
/**
 * classe servant a démarrer l'application
 * 
 */
public class Principal
{

    private Invite lancer_application;
    /**
     * Constructor for objects of class principal
     */
    public Principal()
    {
        lancer_application = new Invite();
    }

    /**
     * Demarre l'application
     * 
     */
    public void demarrer()
    {
        lancer_application.main();
    }
}
