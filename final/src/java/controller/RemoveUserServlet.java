/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CoursesDAO;
import dao.UsersDAO;
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
 * @author pv
 */
public class RemoveUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        UsersDAO udao = new UsersDAO();
        try {
            udao.deleteUser(Integer.parseInt(id));
            response.sendRedirect("ListUserServlet");
            return;
        } catch (Exception ex) {
            Logger.getLogger(DeleteCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("err.jsp");
        }
    }

}
