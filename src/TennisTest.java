import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisTest {
    
    @Test
    public void aucun_joueur_ne_marque_de_point() {
        // Given
        Tennis tennis = new Tennis(0,0);

        // When
        String resultat = tennis.afficherResultatJeuEnCours();

        // Then
        Assertions.assertEquals("Love", resultat);
    }

    @Test
    public void le_joueur_1_marque_1_point() {
        // Given
        Tennis tennis = new Tennis(1,0);

        // When
        String resultat = tennis.afficherResultatJeuEnCours();

        // Then
        Assertions.assertEquals("15-Love", resultat);
    }

}
