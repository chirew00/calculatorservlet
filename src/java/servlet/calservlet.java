/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "calservlet", urlPatterns = {"/calservlet"})
public class calservlet extends HttpServlet {

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
       String input1 = request.getParameter("input1");
       double num1 = Double.parseDouble(input1);
       String input2 = request.getParameter("input2");
       double num2 = Double.parseDouble(input2);
       String result="";
       request.setAttribute("num1",num1);
       request.setAttribute("num2",num2);
       
       
       String operation = request.getParameter("operation");
       
       if(operation != null && operation.equals("add") ){
                result = String.valueOf(num1+num2);
                }else if(operation != null && operation.equals("sub")){
                result = String.valueOf(num1-num2);
                }else if(operation != null && operation.equals("mul")){
                result = String.valueOf(num1*num2);
                }else if(operation != null && operation.equals("div")){
                    if(num2==0){
                    result="Error divide by 0";
                    
                    }else{
                    String.valueOf(num1/num2);
                    }
                }
       request.setAttribute("result",""+result);
       request.getRequestDispatcher("result.jsp").forward(request,response);
       
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
