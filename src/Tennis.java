public class Tennis {

    public static final String LOVE = "Love";

    private int pointJ1;
    private int pointJ2;

    public Tennis(int pointJ1, int pointJ2) {
        this.pointJ1 = pointJ1;
        this.pointJ2 = pointJ2;
    }

    public String afficherResultatJeuEnCours() {
        if (this.pointJ1 == 1) {
            return "15-"+LOVE;
        }
        return LOVE;
    }
}
