/**
 * Created by Lucas on 30/10/2017.
 */
public class Banniere {

    private Famille famille;
    private int points;

    public Banniere(Famille f, int points){
        this.famille = f;
        this.points=points;
    }

    public int getPoints() {
        return points;
    }
}