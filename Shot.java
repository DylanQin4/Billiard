package objectDB;

import java.sql.Time;

public class Shot {
    int idPlayer;
    int idMatch;
    Time shotTime;

    public Shot(){}

    public Shot(int idPlayer, int idMatch, Time shotTime) {
        setIdPlayer(idPlayer);
        setIdMatch(idMatch);
        setShotTime(shotTime);
    }

    public int getIdPlayer() {
        return idPlayer;
    }
    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    public int getIdMatch() {
        return idMatch;
    }
    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }
    public Time getShotTime() {
        return shotTime;
    }
    public void setShotTime(Time shotTime) {
        this.shotTime = shotTime;
    }
}
