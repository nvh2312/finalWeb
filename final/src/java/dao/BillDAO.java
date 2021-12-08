/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Bill;
import Model.RoleType;
import Model.Users;
import dbcontext.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PV
 */
public class BillDAO {

    public ArrayList<Bill> getList() throws Exception {
        ArrayList<Bill> result = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "select * from [dbo].[Bill]";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    result.add(new Bill(rs.getInt(1), rs.getInt(2),rs.getInt(3)));
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

    public void addBill(Bill bill) throws SQLException {
        // create sql for insert
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        try {
                String sql = "insert into [dbo].[Bill] values(?,?)";

            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, bill.getCourseId());
            ps.setInt(2, bill.getUserId());
            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            ps.close();
            con.close();

        }
    }
}