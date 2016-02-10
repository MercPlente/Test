
/**
 * 
 * Permet d'ajouter ou retirer un article de la réservation  ,d'en obtenir un et d'afficher les articles que l'utillisateur possède.
 * Permet d'ajouter ou retirer un article de la Possesion
 * Utilisse la classe Base_donnee, Article et Retard
 * Est utilissee par les classes : Administrateur et Usager
 * 
 */
public class Reservation
{
    // instance variables - replace the example below with your own
    private String article;
    private Retard retard;
    private Principal principal;
    /**
     * Constructor for objects of class reservation
     */
    public Reservation()
    {
        retard = new Retard();
        principal = new Principal();
    }

    /**
     * ajoute un article reserve a une personne
     *
     * @param String nomArticle
     * @param String articleReserve[]
     * @param int id
     * @return tableau avec les articles   
     */
    public int AjouterArticleReserve(String nomArticle,String articleReserve,int id)
    {
        System.out.println("Ajouter (reserver) article");
        principal.demarrer();
        return 0;  
    }
    
     /**
     * retire un article reserve
     *
     * @param String articleReserve[]
     * @param int id
     * @param String nomArticle  
     * @return String articleReserve[]
     */
    public int EnleverArticleReserve(String nomArticle,String articleReserve,int id)
    {
        System.out.println("Enlever article");
        principal.demarrer();
        return 0;
    }
    
     /**
     * Ajoute un objet en la possesion de l'utillisateur
     *
     * @param String tabArticlePosseder[]
     * @param int id
     * @param String nomArticle  
     * @return String tabArticlePosseder[]
     */
    public int AjouterArticlePosseder(String nomArticle,String tabArticlePosseder,int id)
    {
        System.out.println("article ajouter");
        principal.demarrer();
        return 0; 
    }
    
     /**
     * Supprimer un objet en la possesion de l'utillisateur
     *
     * @param String tabArticlePosseder[]
     * @param int id
     * @param String nomArticle  
     * @return String tabArticlePosseder[]
     */
    public int SuprimmerArticlePosseder(String nomArticle,String tabArticlePosseder,int id)
    {
        System.out.println("article suprimmer");
        principal.demarrer();
        return 0;
    }
    
    /**
     * affiche la liste des article en sa possesion
     *
     * @param String tabArticlePosseder[]
     */
    public void afficherArticle(String tabArticlePosseder[] )
    {
        System.out.println("information article");
        principal.demarrer();
    }
    
    /**
     * Getter pour les retards.
     * 
     * @param  retard
     */
    public Retard getRetard(Retard retard)
    {
        return retard;
    }
    
    /**
     * Setter pour les retards.
     * 
     * @param  retard
     */
    public void setRetard(Retard retard)
    {
        this.retard = retard;
    }
}

