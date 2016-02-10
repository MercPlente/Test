import java.util.Scanner;
/**
 *
 * Permet a un admin d'avoir des informations sur les compte utilisateurs et leurs articles et  de lister, reserver, commander des articles
 * Utilisse la classe Base_donnee, Id, Coordonne, Reservation,Article
 * Cette classe hérite la classe Invite 
 */
public class Administrateur extends Invite
{
   private Article article;
   private Id id;
   private Coordonnee coordonnee;
   private Base_donnee base_donnee;
   private Principal principal;
    /**
     * Constructor for objects of class administrateur
     */
    public Administrateur()
    {
        article = new Article();
        id = new Id();
        coordonnee = new Coordonnee();
        base_donnee = new Base_donnee();
        principal = new Principal();
    }

    /**
     * Affiche les informations de l'admin ou un usager
     * 
     * @param int Id
     * @param String Coordonne[]
     * 
     */
    public void afficherInformation(int Id,String Coordonne[])
    {
        System.out.println(" information Admin");
        principal.demarrer();
    }
    
    /**
     * Affiche les informations des articles de l'admin
     * 
     * @param String tabArticlePosseder[]
     * @param String articleReserve[]
     * 
     */
    public void afficherInformation(String tabArticlePosseder[],String articleReserve[])
    {
        System.out.println(" information Admin");
        principal.demarrer();
    }

    /**
     * Ajoute/Supprimer un usager
     * 
     * @param int Id
     * @param String prenom
     * 
     */
    public void AjouterSupprimerUsager(int Id,String prenom)
    {
       System.out.println("ajouter ou suprimmer (supprimer s'il existe sinon il est ajouter)");
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
}
