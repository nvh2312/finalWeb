/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Category;
import Model.Courses;
import dao.CategoryDAO;
import dao.CoursesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TechCare
 */
public class SearchControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            String txtSearch = request.getParameter("txtSearch");
            String indexString = request.getParameter("index");
            int index = Integer.parseInt(indexString);

            CoursesDAO coursesDAO = new CoursesDAO();
            int count = coursesDAO.count(txtSearch);
            int pageSize = 6;
            int endPage = count / pageSize;
            if (count % pageSize != 0) {
                endPage++;
            }
            List<Courses> listSearch;

            CategoryDAO categoryDAO = new CategoryDAO();
            List<Category> listCate = categoryDAO.getList();
            Courses newCourse = coursesDAO.getNewCourse();

            request.setAttribute("newCourse", newCourse);
            request.setAttribute("listCate", listCate);
            listSearch = coursesDAO.search(txtSearch, index, pageSize);
            request.setAttribute("listC", listSearch);
            request.setAttribute("endPage", endPage);
            request.setAttribute("txtSearch", txtSearch);
            request.setAttribute("index", index);

            request.getRequestDispatcher("SearchResultPage.jsp").forward(request, response);
        } catch (Exception e) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
