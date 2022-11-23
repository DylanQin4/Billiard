package objectDB;

public class Score {
    int idMatch;
    int nbShotP1;
    int nbGoalP1;
    int nbShotP2;
    int nbGoalP2;

    public Score(){}

    public Score(int idMatch, int nbShotP1, int nbGoalP1, int nbShotP2, int nbGoalP2) {
        setIdMatch(idMatch);
        setNbShotP1(nbShotP1);
        setNbGoalP1(nbGoalP1);
        setNbShotP2(nbShotP2);
        setNbGoalP2(nbGoalP2);
    }

    public int getIdMatch() {
        return idMatch;
    }
    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }
    public int getNbShotP1() {
        return nbShotP1;
    }
    public void setNbShotP1(int nbShotP1) {
        this.nbShotP1 = nbShotP1;
    }
    public int getNbGoalP1() {
        return nbGoalP1;
    }
    public void setNbGoalP1(int nbGoalP1) {
        this.nbGoalP1 = nbGoalP1;
    }
    public int getNbShotP2() {
        return nbShotP2;
    }
    public void setNbShotP2(int nbShotP2) {
        this.nbShotP2 = nbShotP2;
    }
    public int getNbGoalP2() {
        return nbGoalP2;
    }
    public void setNbGoalP2(int nbGoalP2) {
        this.nbGoalP2 = nbGoalP2;
    }
}
