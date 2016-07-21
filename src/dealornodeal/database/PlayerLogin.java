/*
 */
package dealornodeal.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian & David
 *
 * This class is used to connect to the database with JDBC database connection.
 * First calls the log in frame and then connects to the DB
 */
public class PlayerLogin {

    //create the login frame to start

    private loginJFrame log;
    //driver
//    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //url of db host
    String url = "jdbc:derby://localhost:1527/Score;create=true;";
    //usernameDatabase URL	
    String username = "david";
    //password
    String password = "david";

    Connection conn = null;
    Statement state = null;
    //used to acquire player username and password for db
    String playeruserName;
    String playerPassword;


    //Jdatabase to connect and check if there is a player already with that name.
    String connectNewPlayerCheckDB(String playerName, String passwordString) {
        //assign values from constructor
        this.playeruserName = playerName;
        this.playerPassword = passwordString;
        String returnName = null;
        try {
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("connecting to database...newPlayer");
            conn = DriverManager.getConnection(url, username, password);
            //display message if succcess
            System.out.println("success");
            state = conn.createStatement();
            String updatelist = "select * from playerlogin ";
            ResultSet rs = state.executeQuery(updatelist);
            while (rs.next()) {
                //validation if username already in use
                String userName = rs.getString("username");
                if (userName.equals(playeruserName)) {
                    returnName = "playerNameused";
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } 
        return returnName;
    }

    /**
     *
     * @param playerName
     * @param passwordString 
     * add player login values into db
     */
    public String connectNewPlayerAddDB(String playerName, String passwordString) {
        System.out.print(playerName);
        this.playeruserName = playerName;
        this.playerPassword = passwordString;
        String returnName = null;
        try {
            System.out.println("connecting to database...newPlayer");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("success");
            state = conn.createStatement();
            String update = "INSERT INTO PlayerLogin Values ('" + playeruserName + "', '" + playerPassword + "')";
            state.execute(update);
            returnName = "playerInserted";

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return returnName;
    }

    //Jdatabase to connect and login into the system 
    // checks to see if the user has the right password - validation

    String connectPlayerLoginDB(String playerName, String passwordString) {
        System.out.print(playerName);
        this.playeruserName = playerName;
        this.playerPassword = passwordString;
        String returnName = null;

        try {
            System.out.println("connecting to database...PlayerLogin");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("success");
            state = conn.createStatement();
            String updatelist = "select * from playerlogin ";
            ResultSet rs = state.executeQuery(updatelist);
            while (rs.next()) {
                String uName = rs.getString("userName");
                System.out.println(uName + playeruserName);

                String password = rs.getString("password");
                if (uName.equals(playeruserName)) {
                    returnName = "invaildPassword";

                    System.out.println(returnName);
                }
                if (playerPassword.equals(password)) {
                    returnName = "passwordvaild";
                    System.out.println(returnName);
                }
            }

            rs.close();
            System.out.println(returnName);
            return returnName;
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return returnName;
    }
}
