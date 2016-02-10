import java.sql.*;
/**
 * 
 * Permet au classe : Administrateur, Invite, Usager, Article, Id, Coordonnee et Réservation 
 * d'utilisser des données
 * 
 */
public class Base_donnee
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Base_donnee
     */
    public Base_donnee()
    {

    }
    /*
    
     public void creerTable()
     {
        Connection sqlite = null;
        Statement stmt = null;
        try {
          Class.forName("org.sqlite.JDBC");
          sqlite = DriverManager.getConnection("jdbc:sqlite:interfaceBD.db");
          System.out.println("La BD s'est ouverte");
          stmt = sqlite.createStatement();
          String sql = "CREATE TABLE TPFINAL( " +
                       "(ID INT PRIMARY KEY     AUTOINCREMENT,"+
                       " NOM          TEXT    NOT NULL, " + 
                       " COORDONNEE      CHAR(50), " + 
                       " ARTICLE      CHAR(50), " +
                       " ADMIN CHAR(1) )";
                       
          stmt.executeUpdate(sql);
          stmt.close();
          sqlite.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
    }
    */
}
