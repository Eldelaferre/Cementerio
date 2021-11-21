/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Fallecido;
import modelo.FallecidoDao;
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
@WebServlet(name = "ServletFallecido", urlPatterns = {"/ServletFallecido"})
public class ServletFallecido extends HttpServlet {

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
        
        String nomf,fecn,fecm,fech,resp,cor;
            int codf,codt,tel,y;
            codf=Integer.parseInt(request.getParameter("cf"));
            codt=Integer.parseInt(request.getParameter("ct"));
            nomf=request.getParameter("nf");
            fecn=request.getParameter("fn");
            fecm=request.getParameter("fm");
            fech=request.getParameter("fh");
            resp=request.getParameter("r");
            cor=request.getParameter("c");
            tel=Integer.parseInt(request.getParameter("t"));
            
            Fallecido fal=new Fallecido(codf, codt, nomf,fecn,fecm,fech,resp,cor,tel);
            FallecidoDao usudao=new FallecidoDao();
            y=usudao.insertarFallecido(fal);
               if(y>0){
                   response.sendRedirect("Fallecido.jsp");
                   JOptionPane.showMessageDialog(null,"datos guardados");
                   
               }
               else{
                   JOptionPane.showMessageDialog(null,"los datos no se guardaron");
                   response.sendRedirect("Fallecido.jsp");
               }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
