package ATMSimpublic;
import java.sql.*;

public class connection {
    Connection c;
    Statement s;
    public connection() {
        try {
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagement","root","tys@25");
            s=c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}