package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Determines the next age of the person.
 * @author Shiana Khehra
 */
public class AgeCalculatorServlet extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
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
        String ageInput = request.getParameter("age");
        
        if(ageInput != null) {
            try {
                int age = Integer.parseInt(ageInput);
            
                age++;
        
                String message = String.format("Your age next birthday will be %d.", age);
        
            request.setAttribute("message", message);
            } catch (NumberFormatException ex) {
                request.setAttribute("message", "You must enter a number.");
            }
        } else {
            request.setAttribute("message", "You must give your current age.");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
