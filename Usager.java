
/**
 * 
 * Permet a un utilisateur d'avoir des information sur leur compte et leurs articles et  de lister, reserver, commander des articles
 * Utilisse la classe Base_donnee, Id, Coordonne, Reservation,Article
 * Cette classe hérite la classe Invite
 * 
 */
public class Usager extends Invite
{
    private Article article;
    private Id id;
    private Coordonnee coordonnee;
    private Base_donnee base_donnee;
    private Reservation reservation;
    private Principal principal;
    String tabArticlePosseder;
    String articleReserve;
    /**
     * Constructor for objects of class usager
     */
    public Usager()
    {
        article = new Article();
        id = new Id();
        coordonnee = new Coordonnee();
        base_donnee = new Base_donnee();
        reservation = new Reservation();
        principal = new Principal();
    }
    
    /**
     * Affiche les informations des articles de l'usager
     * 
     * @param int Id
     * @param String tabArticlePosseder[]
     * @param String articleReserve[]
     * 
     */
    public void afficherInformation(int id,String tabArticlePosseder,String articleReserve)
    {
        System.out.println("information usager");
        principal.demarrer();
    }
    
    /**
     * Getter pour les articles.
     * 
     * @param  .
     */
    public Article getArticle(Article aricle)
    {
        return article;
    }
    
    /**
     * Setter pour les aricles.
     * 
     * @param  article
     */
    public void setArticle(Article article)
    {
        this.article = article;
    }
    
        /**
     * Getter pour les id.
     * 
     * @param  id
     */
    public Id getId(Id id)
    {
        return id;
    }
    
    /**
     * Setter pour les amendes.
     * 
     * @param  id
     */
    public void setId(Id id)
    {
        this.id = id;
    }
    
        /**
     * Getter pour les coordonnees.
     * 
     * @param  coordonnees
     */
    public Coordonnee getCoordonne(Coordonnee coordonne)
    {
        return coordonne;
    }
    
    /**
     * Setter pour les coordonnes.
     * 
     * @param  coord   Les coordonnées de l'utilisateur.
     */
    public void setCoordonnee(Coordonnee coordonnee)
    {
        this.coordonnee = coordonnee;
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
     * Getter pour la reservation
     * 
     * @param  reservation.
     */
    public Reservation getReservation(Reservation reservation)
    {
        return reservation;
    }
    
    /**
     * Setter pour la reservation.
     * 
     * @param  reservation.
     */
    public void setReservation(Reservation reservation)
    {
        this.reservation = reservation;
    }
}
