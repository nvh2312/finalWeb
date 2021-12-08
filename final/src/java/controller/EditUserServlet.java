/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Users;
import controller.EditUserServlet;
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
@WebServlet(name = "EditUserServlet", urlPatterns = {"/EditUserServlet"})
public class EditUserServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        UsersDAO uDAO = new UsersDAO();        
        String id = request.getParameter("id");
        try {
            request.setAttribute("USER", uDAO.getUserById(Integer.parseInt(id)));
            request.getRequestDispatcher("EditUser.jsp").forward(request, response);
            return;
        } catch (Exception ex) {
            Logger.getLogger(EditUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("err.jsp");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String id= request.getParameter("txtUserId");
        String username= request.getParameter("txtUsername");
        String password= request.getParameter("txtPassword");
        String avatar= request.getParameter("txtAvatar");
        String email=request.getParameter("txtEmail");
        String profileTitle= request.getParameter("txtProfileTitle");
        String profileDescription= request.getParameter("txtProfileDescription");
        String fullname= request.getParameter("txtFullname");
        String role= request.getParameter("txtRole");
        UsersDAO uDAO = new UsersDAO();   
        try {
            uDAO.updateUser(new Users(Integer.parseInt(id), username, password, avatar,email, profileTitle, profileDescription, fullname, Integer.parseInt(role)));
            request.setAttribute("USERNAME", username);
            request.getRequestDispatcher("UserDetail.jsp").forward(request, response);
            return;
        } catch (Exception ex) {
            Logger.getLogger(EditUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

}