package objectDB;

public class Player {
    int idPlayer;
    String namePlayer;

    public Player(){}

    public Player(int idPlayer, String namePlayer) {
        setIdPlayer(idPlayer);
        setNamePlayer(namePlayer);
    }

    public int getIdPlayer() {
        return idPlayer;
    }
    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    public String getNamePlayer() {
        return namePlayer;
    }
    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }
}
