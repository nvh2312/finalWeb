/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Courses;
import dao.CoursesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pv
 */

public class AddCourseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String courseName= request.getParameter("txtCourseName");
        String courseImage=request.getParameter("txtCourseImage");
        String fee = request.getParameter("txtFee");
        String courseDuration = request.getParameter("txtCourseDuration");
        String teacherName = request.getParameter("txtTeacherName");
        String courseDescription = request.getParameter("txtCourseDescription");
        String category=request.getParameter("txtCategory");
        int cFee=-1;
        int cDuration=-1;
        try {            
            cFee = Integer.parseInt(fee);
        } catch (NumberFormatException e) {
            request.setAttribute("mess", "Fee must be in number");
            request.getRequestDispatcher("AddCourse.jsp").forward(request, response);
            return;
        }
        try {
            cDuration=Integer.parseInt(courseDuration);
        } catch (NumberFormatException e) {
            request.setAttribute("mess", "Course Duration must be in number");
            request.getRequestDispatcher("AddCourse.jsp").forward(request, response);
            return;
        }
        CoursesDAO cdao= new CoursesDAO();
        try {
            cdao.addCourse(new Courses(courseName,courseImage, cFee, cDuration, teacherName, courseDescription,Integer.parseInt(category)));
            response.sendRedirect("CoursesControl?index=1");
            return;
        } catch (Exception ex) {
            Logger.getLogger(AddCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("err.jsp");
        }
    }

}
