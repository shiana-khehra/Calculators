package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Performs arithmetic operations on integer values entered by the user.
 * @author Shiana Khehra
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        request.setAttribute("result", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        if (request.getParameter("firstnum")!=null && request.getParameter("secondnum")!=null) {
        try {
            int num1 = Integer.parseInt(request.getParameter("firstnum"));
            int num2 = Integer.parseInt(request.getParameter("secondnum"));
            
            if (request.getParameter("operator").equals("addition")) {
                request.setAttribute("result", num1 + num2);
            } else if (request.getParameter("operator").equals("subtraction")) {
                request.setAttribute("result", num1 - num2);
            } else if (request.getParameter("operator").equals("multiplication")) {
                request.setAttribute("result", num1 * num2);
            } else {
                request.setAttribute("result", (double)num1 / num2);
            }
            
            request.setAttribute("firstvalue", num1);
            request.setAttribute("secondvalue", num2);
        
        } catch(Exception ex) {
            request.setAttribute("result", "invalid");
        }
        } else {
            request.setAttribute("result", "invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
