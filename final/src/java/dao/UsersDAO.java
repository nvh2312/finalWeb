/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Users;
import dbcontext.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pv
 */
public class UsersDAO {

    public static List<Users> getUsers() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Users> result = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "select * from [dbo].[Users]";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    result.add(new Users(rs.getInt("id_user"), rs.getString("username"), rs.getString("password"), rs.getString("avatar"),rs.getString("email"),rs.getInt("account_balance"), rs.getString("profile_title"), rs.getString("profile_description"), rs.getString("fullname"), rs.getInt("role_id"), rs.getDate("create_at")));
                }
                return result;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return null;
    }
    public static List<Users> getOnlyUsers() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Users> result = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "select * from [dbo].[Users] where role_id=2";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    result.add(new Users(rs.getInt("id_user"), rs.getString("username"), rs.getString("password"), rs.getString("avatar"),rs.getString("email"),rs.getInt("account_balance"), rs.getString("profile_title"), rs.getString("profile_description"), rs.getString("fullname"), rs.getInt("role_id"), rs.getDate("create_at")));
                }
                return result;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return null;
    }

    public void addUser(Users user) throws SQLException {
        // create sql for insert
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            String sql = "insert into [dbo].[Users](username,password,avatar,email,profile_title,profile_description,fullname,role_id) values(?,?,?,?,?,?,?,?)";

            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getAvatar());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getProfileTitle());
            ps.setString(6, user.getProfileDescription());
            ps.setString(7, user.getFullname());
            ps.setInt(8, user.getRole());
            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            ps.close();
            con.close();

        }
    }

    public void deleteUser(int idd) throws SQLException {
        // create the connection
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = db.openConnection();
            // prepare the statement in order to excute the sql comments
            String sql = "delete from [dbo].[Users] where id_user=?";
            statement = con.prepareStatement(sql);
            int id = idd;
            statement.setInt(1, id);
            statement.execute();

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            con.close();
            statement.close();
        }

    }

    public static Users getUser(String username) throws SQLException {
        List<Users> sl = new ArrayList<>();
       
        ConnectDB db = ConnectDB.getInstance();
        Users user = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            String sql = "select * from [dbo].[Users] where username=?";
            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username );
            rs = ps.executeQuery();
            if (rs.next()) {
               
                return new Users(rs.getInt("id_user"),rs.getString("username"), rs.getString("password"), rs.getString("avatar"),rs.getString("email"),rs.getInt("account_balance"), rs.getString("profile_title"), rs.getString("profile_description"), rs.getString("fullname"), rs.getInt("role_id"), rs.getDate("create_at"));

            }

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            rs.close();
            ps.close();
            con.close();
        }
        return null;

    }
    public static Users checkLogin(String username,String password ) throws SQLException {
        List<Users> sl = new ArrayList<>();
       
        ConnectDB db = ConnectDB.getInstance();
        Users user = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            String sql = "select * from [dbo].[Users] where username=? and password=?";
            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
               
                return new Users(rs.getInt("id_user"),rs.getString("username"), rs.getString("password"), rs.getString("avatar"),rs.getString("email"),rs.getInt("account_balance"), rs.getString("profile_title"), rs.getString("profile_description"), rs.getString("fullname"), rs.getInt("role_id"), rs.getDate("create_at"));

            }

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            rs.close();
            ps.close();
            con.close();
        }
        return null;

    }
    public Users getUserById(int idd) throws SQLException {
        List<Users> sl = new ArrayList<>();
       
        ConnectDB db = ConnectDB.getInstance();
        Users user = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            String sql = "select * from [dbo].[Users] where id_user=?";
            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idd );
            rs = ps.executeQuery();
            if (rs.next()) {
               
                return new Users(rs.getInt("id_user"),rs.getString("username"), rs.getString("password"), rs.getString("avatar"),rs.getString("email"),rs.getInt("account_balance"), rs.getString("profile_title"), rs.getString("profile_description"), rs.getString("fullname"), rs.getInt("role_id"), rs.getDate("create_at"));

            }

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            rs.close();
            ps.close();
            con.close();
        }
        return null;

    }
    
    public void updateUser(Users user) throws SQLException {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "update [dbo].[Users] set[username]=?, [password]=?,[avatar]=?,[email]=?, [profile_title]=?,[profile_description]=?,[fullname]=?,[role_id]=? where [id_user]=?";

            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getAvatar());
            ps.setString(4, user.getEmail());
            ps.setNString(5, user.getProfileTitle());
            ps.setNString(6, user.getProfileDescription());
            ps.setNString(7, user.getFullname());
            ps.setInt(8, user.getRole());
            ps.setInt(9, user.getId());                   
            ps.execute();   

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            ps.close();
            con.close();

        }
    }
    
    public void changePassword(Users user) throws SQLException {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "update [dbo].[Users] [password]=? where [id_user]=?";

            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getPassword());           
            ps.setInt(2, user.getId());                   
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
