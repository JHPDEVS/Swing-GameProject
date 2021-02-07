/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 박주형
 */
public class My_CNX {
    private static String server = "zergxp.iptime.org";
    private static String username = "root";
    private static String dbname = "users_db";
    private static Integer portnumber = 3307;
    private static String password = "!wngud123";
    
    public static Connection getConnection() {
        Connection cnx = null;
        
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(server);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(dbname);
        dataSource.setPortNumber(portnumber);
        try {
            cnx = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
            
      
}
}
