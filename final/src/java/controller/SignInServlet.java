/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Users;
import dao.UsersDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
public class SignInServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("SignIn.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String username = request.getParameter("txtUsername");
            String password = request.getParameter("txtPassword");
            Users users = UsersDAO.checkLogin(username, password);
            if (users == null) {
                String error = "Wrong account or password";
                request.setAttribute("MSG", error);
                request.getRequestDispatcher("SignIn.jsp").forward(request, response);
            } else {
                request.getSession().setAttribute("USERNAME", username);
                
                request.getSession().setAttribute("acc",users);
                request.getRequestDispatcher("index.jsp").forward(request, response);
//                request.getRequestDispatcher("Detail.jsp").forward(request, response);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignInServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
