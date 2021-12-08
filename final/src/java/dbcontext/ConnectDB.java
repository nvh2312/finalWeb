/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import static dbcontext.DatabaseInfor.driverName;
import static dbcontext.DatabaseInfor.pass;
import static dbcontext.DatabaseInfor.url;
import static dbcontext.DatabaseInfor.user;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pv
 */
public class ConnectDB implements DatabaseInfor{
    private static ConnectDB instance;

    public Connection openConnection() throws Exception {
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;

    }

    //Get instance of dbms only one time
    public static ConnectDB getInstance() {
        if (instance == null) {
            instance = new ConnectDB();
        }
        return instance;
    } 
}
