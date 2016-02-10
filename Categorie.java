
/**
 * 
 * Permet d'Afficher les categorie, leurs informations et les informations de certains articles
 * Est utilissee par les classes : Article
 */
public interface Categorie
{
    /**
     *affiche les categories
     * 
     * @param   int listeCategorie[] : liste avec les catégories    
     */
    public void AfficheCategorie(int listeCategorie[]);
    
    /**
     *affiche les info des categories ( à l'aide de l'id de la categorie)
     * @param  int listeCategorie[]
     * @param  int listeInfoCategorie[]
     */
    public void AfficheInfoCategorie(int listeInfoCategorie[],int listeCategorie[]);
    
    /**
     *affiche les info des particulieres de certain article ( à l'aide de l'id de la categorie)
     * 
     * @param  int listeInfoCategorie[]
     * @
     */
    public void AfficheInfoParticulier(int listeInfoCategorie[],int listeArticle[]);

}
