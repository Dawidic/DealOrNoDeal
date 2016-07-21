package dealornodeal.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sebastian and David
 *
 * score list is used to maintain the entries into the db
 *
 */
public class ScoreList {

    private loginJFrame log;
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String url = "jdbc:derby://localhost:1527/Score;create=true;";
    //url of the DB host
    String username = "david";  //db username
    String password = "david";   //db password
    String playerName;//log.playerName;
    Connection conn = null;
    Statement state = null;
    float playerScore;

    //connect  to Jdatabase , Adds the Data to the database
    public void connectScoreListDB(String name, float offer) throws Exception {
        System.out.print(name);
        this.playerName = name;
        this.playerScore = offer;
        try {

            System.out.println("connecting to database...");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("success");

            state = conn.createStatement();
            String updateScores = "INSERT INTO ScoreList Values ('" + playerName + "', " + playerScore + ")";
            state.execute(updateScores);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    //connect  to Jdatabase , gets the Data from the database , returns the database as a string
    public String getData() {
        try {
            String returnString;
            int count = 1;
            System.out.println("connecting to database...getdata");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("success");
            state = conn.createStatement();
            String updatelist = "select * FROM ScoreList order by playerscore desc";
            ResultSet rs = state.executeQuery(updatelist);
            returnString = "Positon       Name                                        Score\n";
            while (rs.next()) {
                String name = rs.getString("playername");
                float score = rs.getFloat("playerscore");
                returnString = returnString + count + ":          " + name + "                                    " + score + "\n";
                count++;
            }
            rs.close();
            System.out.print(returnString);
            return returnString;
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return null;
    }
}
