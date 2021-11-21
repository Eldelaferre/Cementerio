/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Estado;
import modelo.EstadoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
@WebServlet(name = "ServletEstado", urlPatterns = {"/ServletEstado"})
public class ServletEstado extends HttpServlet {

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
        PrintWriter out = response.getWriter();
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
        
        String fecr,horr,tipo;
        int ces,cfal,y;
            
            ces=Integer.parseInt(request.getParameter("ce"));
            cfal=Integer.parseInt(request.getParameter("cf"));
            fecr=request.getParameter("fr");
            horr=request.getParameter("hr");
            tipo=request.getParameter("t");
            
            
            Estado est=new Estado(ces, cfal, fecr, horr, tipo);
            EstadoDao estdao=new EstadoDao();
            y=estdao.insertarEstado(est);
               if(y>0){
                   response.sendRedirect("Estado.jsp");
                   JOptionPane.showMessageDialog(null,"datos guardados");
                   
               }
               else{
                   JOptionPane.showMessageDialog(null,"los datos no se guardaron");
                   response.sendRedirect("Estado.jsp");
               }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
