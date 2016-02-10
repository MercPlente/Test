import java.util.Scanner;
/**
 * Write a description of class Connection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Connection
{
    // instance variables - replace the example below with your own
    private int id;
    private String password;
    private Article article;
    private Reservation reserver;
    private Usager usager;
    private Administrateur admin;
    int continuer = 1;
    String choix;

    /**
     * Constructor for objects of class Connection
     */
    public Connection()
    {
    article = new Article();
    usager = new Usager();
    reserver = new Reservation();
    admin = new Administrateur();
    }

    /**
     *  Connecter a un compte usager si l'id existe et que le mot de passe correspondant ets valide
     * 
     * @param  
     */
    public int connectionUsager(int id, String password )
    {
        Scanner user_input = new Scanner( System.in );
        System.out.println("1) Réservé\n2)Annuler une reservation\n3) Lister des objets\n4) Affichier les informations\n5) Afficher info des articles");
        choix = user_input.next( );
        
       if (choix.equals("1")){
           reserver.AjouterArticleReserve("","",0);
       }
       if (choix.equals("2")){
           reserver.EnleverArticleReserve("","",0);
        }
       if (choix.equals("3")){
           article.ListeArticle("",0,"");
        }
       if (choix.equals("4")){
           usager.afficherInformation(0,"","");
        }
       if (choix.equals("5")){
           article.AfficherArticle("");
        }
       return 0;
    }
    
    
    /**
     *  Connecter a un compte admin si l'id existe et que le mot de passe correspondant est valide
     * 
     * @param  
     */
    public int connectionAdmin(int id, String password )
    {
          Scanner user_input = new Scanner( System.in );
        System.out.println("1) Réservé\n2)Annuler une reservation\n3) Lister des objets\n4) Affichier les informations\n5) Afficher info des articles\n6)Ajouter article\n7)Rapporte article\n8) Ajouter/Supprimer usager");
        choix = user_input.next( );
        
       if (choix.equals("1")){
           reserver.AjouterArticleReserve("","",0);
       }
       if (choix.equals("2")){
           reserver.EnleverArticleReserve("","",0);
        }
       if (choix.equals("3")){
           article.ListeArticle("",0,"");
        }
       if (choix.equals("4")){
           usager.afficherInformation(0,"","");
        }
       if (choix.equals("5")){
           article.AfficherArticle("");
        }
       if (choix.equals("6")){
           reserver.AjouterArticlePosseder("","",0);
        }
       if (choix.equals("7")){
           reserver.SuprimmerArticlePosseder("","",0);
        }
       if (choix.equals("8")){
           admin.AjouterSupprimerUsager(0,"");
        }

       return 0;
    }
}
