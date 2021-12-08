/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ListRole;
import dao.CategoryDAO;
import dao.RoleDAO;
import dao.UsersDAO;
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


  @WebServlet(name = "ListUserServlet", urlPatterns = {"/ListUserServlet"})
public class ListUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        UsersDAO udao= new UsersDAO();
        RoleDAO rdao = new RoleDAO();

        try {
            request.setAttribute("LIST", udao.getOnlyUsers());
            request.getRequestDispatcher("ManageUser.jsp").forward(request, response);
            return;
        } catch (Exception ex) {
            Logger.getLogger(ListUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("err.jsp");
        }
    }

}
