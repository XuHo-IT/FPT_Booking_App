/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.UserDAO;
import DBConnect.DBConnect;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class RegisterController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        try {
            String name = request.getParameter("name");
            String dob = request.getParameter("dob");
            String phno = request.getParameter("phone");
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String check = request.getParameter("check");


            HttpSession session = request.getSession();
            User us = new User();
            us.setUserName(name);
            us.setPhone(phno);
            // Assuming dob is in YYYY-MM-DD format
            LocalDate dobLocalDate = LocalDate.parse(dob);
            Date dobDate = java.sql.Date.valueOf(dobLocalDate);
            us.setDoB(dobDate);
            Boolean gender2 = Boolean.parseBoolean(gender);
            us.setGender(gender2);
            us.setAddress(address);
            us.setEmail(email);
            us.setPassword(password);

            if (check != null) {
                UserDAO dao = new UserDAO((Connection) DBConnect.getConn());
                boolean f = dao.userRegister(us);
                if (f) {
//                  System.out.println("User Register Sucess...");
                    session.setAttribute("succMsg", "Registration Sucessfully..");
                    response.sendRedirect("register.jsp");
                } else {
//                  System.out.println("Something went wrong on server....");
                    session.setAttribute("failedMsg", "Something went wrong on sever..");
                    response.sendRedirect("register.jsp");
                }
            } else {
//                          System.out.println(name+email+phno+password+check);
                session.setAttribute("failedMsg", "Please check Agree & Terms Condition");
                response.sendRedirect("register.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
