/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BillDAO;
import dao.RoleDAO;
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
 * @author PV
 */
public class ListBillServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        BillDAO billDAO=new BillDAO();

        try {
            request.setAttribute("LISTB", billDAO.getList());
            request.getRequestDispatcher("Bill.jsp").forward(request, response);
            return;
        } catch (Exception ex) {
            Logger.getLogger(ListUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("err.jsp");
        }
    }
}
