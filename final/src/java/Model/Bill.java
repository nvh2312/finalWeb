/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PV
 */

public class Bill {
    private int id;
    private int userId;
    private int courseId;

    public Bill() {
    }

    public Bill(int id, int userId, int courseId) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
    }
    public Bill(int userId, int courseId) {
        this.userId = userId;
        this.courseId = courseId;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    
     @Override
    public String toString() {
        return "Bill{" + "id=" + id + ", userId=" + userId + ", courseId=" + courseId + '}';
    }
}