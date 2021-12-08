/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Bill;
import Model.Courses;
import Model.Users;
import dao.BillDAO;
import dao.CoursesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PV
 */
public class RegisterCourseServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String courseId = request.getParameter("txtCourseId");
        String userId = request.getParameter("txtUserId");
        int id = Integer.parseInt(courseId);
        CoursesDAO coursesDAO = new CoursesDAO();
       

        BillDAO billDAO = new BillDAO();
        try {
            billDAO.addBill(new Bill(Integer.parseInt(userId), Integer.parseInt(courseId)));
            Courses p = coursesDAO.getCoursesbyId(id);
            request.setAttribute("detail",p);
            request.getRequestDispatcher("Congrats.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(RegisterCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("err.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}