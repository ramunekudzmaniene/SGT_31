package db.WLT;
import java.sql.*;

public class DataBase {
    public class dataBase {
        private final String dbURL = "jdbc:mysql://localhost:3306/java31";
        private final String username = "root";
        private final String password = "Beata";
        /*protected String dlid = null;
        protected String pswrd = null;
        protected String name = null;
        protected String surname = null;*/
    }

    public int createUser(String dlid, String pswrd, String name, String surname) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "Beata")) {

            String sql = "INSERT INTO drivers (dlid, pswrd, name, surname) VALUES (?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, dlid);
            preparedStatement.setString(2, pswrd);
            preparedStatement.setString(3, name);
            preparedStatement.setString(4, surname);
            preparedStatement.executeUpdate();

            //int rowsInserted = statement.executeUpdate();

            //to get the dlid of the current user
            String sqlID = "SELECT * FROM drivers WHERE dlid ='" + dlid + "' and pswrd ='" + pswrd + "'";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlID);
            if (resultSet.next()) {
                return resultSet.getInt(1);//returns current dlid no.
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return 0;
    }

    public int checkDlid(String dlid) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "Beata")) {
            String sqlUser = "SELECT * FROM drivers WHERE dlid ='" + dlid + "'";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlUser);
            if (resultSet.next()) {
                //returns Users ID Nr.
                return resultSet.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int checkDlidAndPswrd(String dlid, String pswrd) { //pvz checkLogin
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "Beata")) {
            String sql = "SELECT * FROM drivers WHERE dlid ='" + dlid + "' and pswrd ='" + pswrd + "'";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                //returns existing Users dlid.
                return resultSet.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public int createTrip(int distance, String date_time, int price) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "Beata")) {

            String sql = "INSERT INTO trips (distance, date_time, price) VALUES (?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, distance);
            preparedStatement.setString(2,date_time);
            preparedStatement.setInt(3,price);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
        }
            return 0;


    }

}