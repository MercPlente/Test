import java.util.Scanner;
/**
 * 
 * Permet a un utilisateur non enregistrer de lister des articles
 * Utilisse la classe Base_donnee
 * Elle hérite des classes : Administrateur et Usager
 * 
 */
public class Invite
{
    private Connection connection;
    private Article article;
    String continuer = "1";
    String choix;
    /**
     * Constructor for objects of class invite
     */
    public Invite()
    {
        connection = new Connection();
        article = new Article();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void main()
    {
       Scanner user_input = new Scanner( System.in );
        while (continuer.equals("1")){
           System.out.println("1) connection admin \n2) connection usager\n3) Lister des articles\n");
           choix = user_input.next( );
           if (choix.equals("1")){
               connection.connectionAdmin(0,"");
               continuer = "0";
            }
           if (choix.equals("2")){
               connection.connectionUsager(0,"");
               continuer = "0";
            }
           if (choix.equals("3")){
               article.ListeArticle("",0,"");
               continuer = "0";
            }
       }
    }
    
        /**
     * Getter pour la connection
     * 
     * @param  connection
     */
    public Connection getConnection(Connection connection)
    {
        return connection;
    }
    
    /**
     * Setter pour la connection.
     * 
     * @param  connection.
     */
    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }
}
