import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String URL = "jdbc:mariadb://localhost:3307/classicmodels";
        String USER = "root";
        String PASS = "root";
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASS);

            System.out.println(connection.isValid(1000));

            // Get employees in offices 1 and 4
            String sqlStatement = "SELECT * FROM employees WHERE officeCode IN (?, ?)";
            PreparedStatement myStmnt = connection.prepareStatement(sqlStatement);
            myStmnt.setInt(1, 1);
            myStmnt.setInt(2, 4);

            System.out.println(myStmnt.toString());

            ResultSet result = myStmnt.executeQuery();

            while(result.next()) {
                String lastName = result.getString("lastName");
                String firstName = result.getString("firstName");
                System.out.println(lastName + " " + firstName);

            }

            // Get cancelled orders
            String sqlStatement2 = "SELECT * FROM orders WHERE status = ?";
            PreparedStatement myStmnt2 = connection.prepareStatement(sqlStatement2);
            myStmnt2.setString(1, "Cancelled");

            result = myStmnt2.executeQuery();

            while(result.next()) {
                int orderNumber = result.getInt("orderNumber");
                System.out.println(orderNumber);

            }

            connection.close();

//            // Can use this to rollback changes
//            connection.setAutoCommit(false);
//            if() {
//                connection.close();
//            } else {
//                connection.rollback();
//            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }

}
