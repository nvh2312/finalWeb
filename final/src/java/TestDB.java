
import Model.Category;
import Model.Courses;
import Model.Users;
import dao.CategoryDAO;
import dao.CoursesDAO;
import dao.UsersDAO;
import java.util.ArrayList;
import java.util.List;
import org.apache.catalina.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pv
 */
public class TestDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        UsersDAO ud = new UsersDAO();
//       List<Users> list= ud.getOnlyUsers();
//       for (Users users : list) {
//           System.out.println(""+users);
//            
//        }
//System.out.println(""+ ud.checkLogin("admin01", "admin01"));
        //Users us = new Users( "admin04", "admin04", "https://www.facebook.com", " Quang Thang", "TDX Studio", "Lê Thị Thùy Dương", 2);
      // ud.addUser(us);
//        ud.deleteUser(5);
//System.out.println(""+ ud.getUser(1));
        //ud.updateUser(us);
      CoursesDAO coursesDAO = new CoursesDAO();
//        List<Courses> c = coursesDAO.getCourses();
//        for (Courses courses : c) {
//            System.out.println("" + courses);
//            
//        }

      Courses c1 = new Courses(10,"Tiếng anh cho người đi làm","https://www.facebook.com/tduong31", 299, 50, "Thuy Duong", "Khóa hocj hỗ trợ cho người đi làm lấy tín chỉ tiếng anh",2);
//       coursesDAO.addCourse(c1);
       coursesDAO.updateCourse(c1);
        //coursesDAO.deleteCourse(2);
//        System.out.println("" + coursesDAO.getCourse(1));
//        CategoryDAO categoryDAO= new CategoryDAO();
//        List<Category> categorys= categoryDAO.getList();
//        for (Category category : categorys) {
//            System.out.println(""+ category);
//        }
    }
    
}
