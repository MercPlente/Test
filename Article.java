
/**
 * 
 * Permet d'affichier les articles et de les lister
 * Utilisse la classe Base_donnee et Categorie
 * Est utilissee par les classes : Administrateur,Usager et Reservation
 */
public class Article
{
    // instance variables - replace the example below with your own
    private String tabListeArticle;
    private String tabUtilisateurArticle;
    private CategorieA categorieA;
    private CategorieB categorieB;
    private CategorieC categorieC;
    private Base_donnee base_donnee;
    private Principal principal;

    /**
     * Constructor for objects of class article
     */
    public Article()
    {
        categorieA = new CategorieA();
        categorieB = new CategorieB();
        categorieC = new CategorieC();
        principal = new Principal();
    }

    /**
     * Afficher les articles
     * 
     * @param  int tabArticles[]     
     */
    public void AfficherArticle(String tabArticles)
    {
        System.out.println("informations articles");
        principal.demarrer();
    }
    
    /**
     * Lister des articles
     * 
     * @param  int tabArticles[]
     * @param  int id
     * @param  String tabUtilisateurArticle[]
     * 
     */
    public void ListeArticle(String tabArticles,int id,String tabUtilisateurArticle)
    {
        System.out.println("liste des objets");
        principal.demarrer();
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
    
        /**
     * Getter pour la categorieA
     * 
     * @param  categorieA
     */
    public CategorieA getCategorieA(CategorieA categorieA)
    {
        return categorieA;
    }
    
    /**
     * Setter pour la categorieA.
     * 
     * @param  categorieA.
     */
    public void setcategorieA(CategorieA categorieA)
    {
        this.categorieA = categorieA;
    }
    
        /**
     * Getter pour la categorieB
     * 
     * @param  categorieB
     */
    public CategorieB getCategorieB(CategorieB categorieB)
    {
        return categorieB;
    }
    
    /**
     * Setter pour la categorieB.
     * 
     * @param  categorieB.
     */
    public void setcategorieB(CategorieB categorieB)
    {
        this.categorieB = categorieB;
    }
    
        /**
     * Getter pour la categorieC
     * 
     * @param  categorieC
     */
    public CategorieC getCategorieC(CategorieC categorieC)
    {
        return categorieC;
    }
    
    /**
     * Setter pour la categorieC.
     * 
     * @param  categorieC.
     */
    public void setcategorieC(CategorieC categorieC)
    {
        this.categorieC = categorieC;
    }
}
