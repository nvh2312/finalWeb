/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Category;
import Model.Courses;
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
public class CoursesDAO {

    public List<Courses> getCourses() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Courses> result = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "select * from [dbo].[Courses]";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    result.add(new Courses(rs.getInt("id_course"), rs.getString("name_course"), rs.getString("course_image"), rs.getInt("fee"), rs.getInt("course_duration"), rs.getString("teacher_name"), rs.getString("course_description"), rs.getInt("category")));
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

    public Courses getCourse(int idd) throws SQLException {
        List<Courses> sl = new ArrayList<>();
        int id = idd;
        ConnectDB db = ConnectDB.getInstance();
        Courses courses = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            String sql = "select * from [dbo].[Courses] where id_course=?";
            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {

                sl.add(new Courses(rs.getInt("id_course"), rs.getString("name_course"), rs.getString("course_image"), rs.getInt("fee"), rs.getInt("course_duration"), rs.getString("teacher_name"), rs.getString("course_description"), rs.getInt("category")));

            }

        } catch (Exception ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            con.close();
        }
        return null;

    }

    public Courses getNewCourse() {
        String query = "select top 1 * from Courses\n"
                + "order by id_course desc";
        ConnectDB db = ConnectDB.getInstance();
        Courses courses = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = db.openConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Courses(
                        rs.getInt("id_course"),
                        rs.getString("name_course"),
                        rs.getString("course_image"),
                        rs.getInt("fee"),
                        rs.getInt("course_duration"),
                        rs.getString("teacher_name"),
                        rs.getString("course_description"),
                        rs.getInt("category"));
            }
        } catch (Exception e) {

        }

        return null;
    }

    public List<Courses> getCoursesbyCategory(int cid) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Courses> result = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "select * from Courses\n"
                        + "inner join Category\n"
                        + "on Category.cate_id = Courses.category and Category.cate_id=?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, cid);
                rs = ps.executeQuery();
                while (rs.next()) {
                    result.add(new Courses(rs.getInt("id_course"), rs.getString("name_course"), rs.getString("course_image"), rs.getInt("fee"), rs.getInt("course_duration"), rs.getString("teacher_name"), rs.getString("course_description"), rs.getInt("category")));
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

    public List<Courses> pagingCourses(int cid) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Courses> result = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "select * from Courses\n"
                        + "order by id_course desc\n"
                        + "offset ? row fetch next 6 row only;";
                ps = con.prepareStatement(sql);
                ps.setInt(1, (cid - 1) * 6);
                rs = ps.executeQuery();
                while (rs.next()) {
                    result.add(new Courses(rs.getInt("id_course"), rs.getString("name_course"), rs.getString("course_image"), rs.getInt("fee"), rs.getInt("course_duration"), rs.getString("teacher_name"), rs.getString("course_description"), rs.getInt("category")));
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

    public Courses getCoursesbyId(int cid) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Courses> result = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        try {
            con = db.openConnection();
            if (con != null) {
                String sql = "select * from Courses\n"
                        + "where id_course = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, cid);
                rs = ps.executeQuery();
                while (rs.next()) {
                    return new Courses(
                            rs.getInt("id_course"),
                            rs.getString("name_course"),
                            rs.getString("course_image"),
                            rs.getInt("fee"),
                            rs.getInt("course_duration"),
                            rs.getString("teacher_name"),
                            rs.getString("course_description"),
                            rs.getInt("category"));
                }

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

    public void addCourse(Courses course) throws SQLException {
        // create sql for insert
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "insert into [dbo].[Courses] values (?,?,?,?,?,?,?)";

            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, course.getCourseName());
            ps.setString(2, course.getCourseImage());
            ps.setInt(3, course.getFee());
            ps.setInt(4, course.getCourseDuration());
            ps.setString(5, course.getTeacherName());
            ps.setString(6, course.getCourseDescription());
            ps.setInt(7, course.getCategory());
            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(CoursesDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            ps.close();
            con.close();

        }
    }

    public void deleteCourse(int idd) throws SQLException {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = db.openConnection();
            String sql = "delete from [dbo].[Courses] where id_course=?";
            statement = con.prepareStatement(sql);
            int id = idd;
            statement.setInt(1, id);
            statement.execute();

        } catch (Exception ex) {
            Logger.getLogger(CoursesDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            con.close();
            statement.close();
        }

    }

    public void updateCourse(Courses course) throws SQLException {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "update [dbo].[Courses] set [name_course]=?,[course_image]=?, [fee]=?,[course_duration]=?,[teacher_name]=?,[course_description]=?, [category]=? where [id_course]=?";

            con = db.openConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, course.getCourseName());
            ps.setString(2, course.getCourseImage());
            ps.setInt(3, course.getFee());
            ps.setInt(4, course.getCourseDuration());
            ps.setString(5, course.getTeacherName());
            ps.setString(6, course.getCourseDescription());
            ps.setInt(7, course.getCategory());
            ps.setInt(8, course.getCourseId());

            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(CoursesDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            ps.close();
            con.close();

        }
    }

    public int count(String txtSearch) {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //viet query
            String query = "select count(*) from Courses where name_course like ?";
            //mo ket noi toi sql server
            con = db.openConnection();
            //nem cau lenh query sang sql server
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            //execute query va nhan ket qua tra ve
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
            // lay du lieu tu bang rs => nem sang 1 object

        } catch (Exception e) {

        }
        return 0;
    }

    public int countKH() {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //viet query
            String query = "select count(*) from Courses";
            //mo ket noi toi sql server
            con = db.openConnection();
            //nem cau lenh query sang sql server
            ps = con.prepareStatement(query);
            //execute query va nhan ket qua tra ve
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
            // lay du lieu tu bang rs => nem sang 1 object

        } catch (Exception e) {

        }
        return 0;
    }

    public List<Courses> search(String txtSearch, int index, int size) {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "with x as(select ROW_NUMBER() over (order by id_course asc)as R,* from Courses where name_course like ?)\n"
                    + "select * from x where r between ?*?-? and ?*?";
            con = db.openConnection();

            ps = con.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ps.setInt(2, index);
            ps.setInt(3, size);
            ps.setInt(4, size - 1);
            ps.setInt(5, index);
            ps.setInt(6, size);

            rs = ps.executeQuery();
            List<Courses> list = new ArrayList<>();
            while (rs.next()) {
                Courses c = new Courses(
                        rs.getInt("id_course"),
                        rs.getString("name_course"),
                        rs.getString("course_image"),
                        rs.getInt("fee"),
                        rs.getInt("course_duration"),
                        rs.getString("teacher_name"),
                        rs.getString("course_description"),
                        rs.getInt("category")
                );
                list.add(c);
            }

            return list;
        } catch (Exception e) {

        }
        return null;
    }

}
