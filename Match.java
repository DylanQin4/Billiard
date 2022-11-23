package objectDB;

import java.sql.Time;

public class Match {
    int idMatch;
    int idChampionship;
    int idPlayer1;
    int idPlayer2;
    Time dateMatch;

    public Match(){}

    public Match(int idMatch, int idChampionship, int idPlayer1, int idPlayer2, Time dateMatch) {
        setIdMatch(idMatch);
        setIdChampionship(idChampionship);
        setIdPlayer1(idPlayer1);
        setIdPlayer2(idPlayer2);
        setDateMatch(dateMatch);
    }

    public int getIdMatch() {
        return idMatch;
    }
    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }
    public int getIdChampionship() {
        return idChampionship;
    }
    public void setIdChampionship(int idChampionship) {
        this.idChampionship = idChampionship;
    }
    public int getIdPlayer1() {
        return idPlayer1;
    }
    public void setIdPlayer1(int idPlayer1) {
        this.idPlayer1 = idPlayer1;
    }
    public int getIdPlayer2() {
        return idPlayer2;
    }
    public void setIdPlayer2(int idPlayer2) {
        this.idPlayer2 = idPlayer2;
    }
    public Time getDateMatch() {
        return dateMatch;
    }
    public void setDateMatch(Time dateMatch) {
        this.dateMatch = dateMatch;
    }
}
