/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Login;
import Modelo.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
@WebServlet(name = "Servletlogin", urlPatterns = {"/Servletlogin"})
public class Servletlogin extends HttpServlet {

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
        
        
        
        if(request.getParameter("btnlogin")!=null){
            ArrayList<Login> lista=new ArrayList<>();
            String u,c,r,n;
            
            u=request.getParameter("usu");
            c=request.getParameter("cla");
            r=request.getParameter("");
            n =request.getParameter("");
            
            
            JOptionPane.showMessageDialog(null,"usu "+ u+ "cla "+c);
            

            Login lo=new Login(u, c);
            Login datlo=new Login (u, c, r, n);
            LoginDao ld=new LoginDao();
            lista=ld.logindao(lo);
                   
            JOptionPane.showMessageDialog(null," usu "+ u+ " cla "+c+ " nom "+n+ " rol "+r);
            
            if(lista.size()>0){
            
            for(int i=0; i<lista.size();i++){
                datlo=lista.get(i);
                
                
            }
            if(datlo.getUsuario().equals(u)&& datlo.getClave().equals(c)){
                    HttpSession sesion=request.getSession();
                    sesion.setAttribute("sesion",u);
                    sesion.setAttribute("nomsesion",datlo.getNombre());
                    sesion.setAttribute("clavesesion",datlo.getClave());
                          
                
                if(datlo.getRol().equals("trabajador")){
                    JOptionPane.showMessageDialog(null, "Ha ingresado como trabajador");
                    response.sendRedirect("EspacioEmpleado.jsp");
                }
                else if(datlo.getRol().equals("administrador")){
                    JOptionPane.showMessageDialog(null,"Ha ingresado como administrador");
                    response.sendRedirect("EspacioEmpleado.jsp");
                        
                    
                }
                else if(datlo.getRol().equals("visitante")){
                    JOptionPane.showMessageDialog(null,"ha ingresado como visitante");             
                    response.sendRedirect("EspacioEmpleado.jsp");
    
                }
            }
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos incorrectos");
                response.sendRedirect("index.jsp");
            }
            
            
            }
        
        
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
