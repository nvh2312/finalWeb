/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.RoleType;
import dbcontext.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pv
 */
public class RoleDAO {
    public ArrayList<RoleType> getList() throws Exception {
        ArrayList<RoleType> result = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "Select * from RoleType";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    result.add(new RoleType(rs.getInt(1), rs.getString(2)));
                }
                return result;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }

        return null;
    }
}
