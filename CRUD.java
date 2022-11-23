package objectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Vector;

import connectivity.ConnectDB;
import objectDB.Championship;
import objectDB.Player;

public class CRUD {
    // --------------------START PLAYER--------------------
    public Player[] selectPlayers()throws Exception{
        Connection co = new ConnectDB().connectTO("oracle");
        Vector<Player> listPlayers = new Vector<Player>();
        String request = "select * from player";
        Statement state = co.createStatement();
        ResultSet result = state.executeQuery(request);
        while (result.next()) {
            Player temp = new Player();
            temp.setIdPlayer(result.getInt("idPlayer"));
            temp.setNamePlayer(result.getString("namePlayer"));
            listPlayers.add(temp);
        }
        Player[] tabPlayers = new Player[listPlayers.size()];
        listPlayers.copyInto(tabPlayers);
        co.close();
        return tabPlayers;
    }
    public void insertPlayer(String name)throws Exception{
        Connection co = new ConnectDB().connectTO("oracle");
        java.sql.Statement stat = co.createStatement();
        try {
            stat.executeUpdate("INSERT INTO PLAYER VALUES ('','" + name + "')");

            stat.executeUpdate("commit");
        }catch (Exception e) {
            stat.executeUpdate("rollback");
            throw new Exception(e.getMessage());
        }finally {
            stat.close();
            co.close();
        }
    }
    public String[] getNameAllPlayer()throws Exception{
        Player[] players = selectPlayers();
        String[] resp = new String[players.length];
        for (int i = 0; i < resp.length; i++) {
            resp[i] = players[i].getNamePlayer();
        }
        return resp;
    }
    public int getidPlayer(String namePlayer)throws Exception{
        Player[] players = selectPlayers();
        int resp = -1;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getNamePlayer() == namePlayer) {
                resp = players[i].getIdPlayer();
            }
        }
        return resp;
    }

    // --------------------END PLAYER--------------------


    // --------------------START CHAMPIONSHIP--------------------
    public Championship[] selectShampionship()throws Exception{
        Connection co = new ConnectDB().connectTO("oracle");
        Vector<Championship> listChampionships = new Vector<Championship>();
        String request = "select * from championship";
        Statement state = co.createStatement();
        ResultSet result = state.executeQuery(request);
        while (result.next()) {
            Championship temp = new Championship();
            temp.setIdChampionship(result.getInt("idChampionship"));
            temp.setYears(result.getInt("years"));
            listChampionships.add(temp);
        }
        Championship[] tabChampionships = new Championship[listChampionships.size()];
        listChampionships.copyInto(tabChampionships);
        co.close();
        return tabChampionships;
    }
    public void insertChampionship(int years)throws Exception{
        Connection co = new ConnectDB().connectTO("oracle");
        Statement stat = co.createStatement();
        try {
            stat.executeUpdate("insert into championship values(''," + years + ")");

            stat.executeUpdate("commit");
        }catch (Exception e) {
            stat.executeUpdate("rollback");
            throw new Exception(e.getMessage());
        }finally {
            stat.close();
            co.close();
        }
    }
    public int getIdChampionship(int years)throws Exception{
        Championship[] championship = selectShampionship();
        int rep = -1;
        for (int i = 0; i < championship.length; i++) {
            if (championship[i].getYears() == years) {
                rep = championship[i].getIdChampionship();
            }
        }
        return rep;
    }

    // --------------------END CHAMPIONSHIP--------------------
    

    // --------------------START MATCH--------------------
    public Match[] selectMatch()throws Exception{
        Connection co = new ConnectDB().connectTO("oracle");
        Vector<Match> listMatchs = new Vector<Match>();
        String request = "select * from match";
        Statement state = co.createStatement();
        ResultSet result = state.executeQuery(request);
        while (result.next()) {
            Match temp = new Match();
            temp.setIdMatch(result.getInt("idMatch"));
            temp.setIdChampionship(result.getInt("idChampionship"));
            temp.setIdPlayer1(result.getInt("idPlayer1"));
            temp.setIdPlayer2(result.getInt("idPlayer2"));
            temp.setDateMatch(result.getTime("dateMatch"));
            LocalDateTime localDateTime;
            listMatchs.add(temp);
        }
        Match[] tabMatchs = new Match[listMatchs.size()];
        listMatchs.copyInto(tabMatchs);
        co.close();
        return tabMatchs;
    }
    public void insertMatch(int idChampionship, int idPlayer1, int idPlayer2)throws Exception{
        Connection co = new ConnectDB().connectTO("oracle");
        Statement stat = co.createStatement();
        try {
            stat.executeUpdate("insert into match values(''," + idChampionship + ","+ idPlayer1 +","+idPlayer2+")");

            stat.executeUpdate("commit");
        }catch (Exception e) {
            stat.executeUpdate("rollback");
            throw new Exception(e.getMessage());
        }finally {
            stat.close();
            co.close();
        }
    }

    // --------------------END MATCH--------------------

    
    // --------------------START SCORE--------------------
    public Score[] selectScore()throws Exception{
        Connection co = new ConnectDB().connectTO("oracle");
        Vector<Score> listScores = new Vector<Score>();
        String request = "select * from score";
        Statement state = co.createStatement();
        ResultSet result = state.executeQuery(request);
        while (result.next()) {
            Score temp = new Score();
            temp.setIdMatch(result.getInt("idMatch"));
            temp.setNbShotP1(result.getInt("nbShotP1"));
            temp.setNbGoalP1(result.getInt("nbGoalP1"));
            temp.setNbShotP2(result.getInt("nbShotP2"));
            temp.setNbGoalP2(result.getInt("nbGoalP2"));
            listScores.add(temp);
        }
        Score[] tabScores = new Score[listScores.size()];
        listScores.copyInto(tabScores);
        co.close();
        return tabScores;
    }

    // --------------------END SCORE--------------------

    
    // --------------------START SHOT--------------------
    public Shot[] selectShot()throws Exception{
        Connection co = new ConnectDB().connectTO("postgres");
        Vector<Shot> listShots = new Vector<Shot>();
        String request = "select * from shot";
        Statement state = co.createStatement();
        ResultSet result = state.executeQuery(request);
        while (result.next()) {
            Shot temp = new Shot();
            temp.setIdPlayer(result.getInt("idPlayer"));
            temp.setIdMatch(result.getInt("idMatch"));
            temp.setShotTime(result.getTime("shotTime"));
            listShots.add(temp);
        }
        Shot[] tabShots = new Shot[listShots.size()];
        listShots.copyInto(tabShots);
        co.close();
        return tabShots;
    }
    public void insertShot(){
        
    }

    // --------------------END SHOT--------------------
        
}
