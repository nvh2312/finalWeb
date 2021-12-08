/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.UsersDAO;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author pv
 */
public class Users {

    private int id;
    private String username;
    private String password;
    private String avatar;
    private String email;
    private int balance;
    private String profileTitle;
    private String profileDescription;
    private String fullname;
    private int role;
    private Date createAt;

    public Users() {
    }

    public Users(int id, String username, String password, String avatar, String profileTitle, String profileDescription, String fullname, int role, Date createAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
        this.createAt = createAt;
    }

    public Users(int id, String username, String password, String avatar, String email, int balance, String profileTitle, String profileDescription, String fullname, int role, Date createAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.email = email;
        this.balance = balance;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
        this.createAt = createAt;
    }
    public Users(int id, String username, String password, String avatar, String email, int balance, String profileTitle, String profileDescription, String fullname, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.email = email;
        this.balance = balance;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
    }
    public Users(int id, String username, String password, String avatar, String email, String profileTitle, String profileDescription, String fullname, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.email = email;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
    }
        public Users( String username, String password, String avatar, String email, String profileTitle, String profileDescription, String fullname, int role) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.email = email;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
    }
    
    public Users(int id, String username, String password, String avatar, String profileTitle, String profileDescription, String fullname, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
     
    }

    public Users(String username, String password, String avatar, String profileTitle, String profileDescription, String fullname, int role) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
    }

    public Users(String username, String password, String avatar, String profileTitle, String profileDescription, String fullname, int role, Date createAt) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.profileTitle = profileTitle;
        this.profileDescription = profileDescription;
        this.fullname = fullname;
        this.role = role;
        this.createAt = createAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getProfileTitle() {
        return profileTitle;
    }

    public void setProfileTitle(String profileTitle) {
        this.profileTitle = profileTitle;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", username=" + username + ", password=" + password + ", avatar=" + avatar + ", profileTitle=" + profileTitle + ", profileDescription=" + profileDescription + ", fullname=" + fullname + ", role=" + role + ", createAt=" + createAt + '}';
    }
    public  Users CheckLogin(String username,String password) throws SQLException{
        Users user=UsersDAO.checkLogin(username, password);
        if(user.getPassword().equals(password)) return user;
        else return null;
    }

}
