/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Ficha;
import modeldao.FichaDao;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorFicha", urlPatterns = {"/ControladorFicha"})
public class ControladorFicha extends HttpServlet {

    String agregarficha = "view/FFicha.jsp";
    String listadoficha = "view/listadoficha.jsp";
    String editarficha= "view/EditarF.jsp";
    
   Ficha f = new Ficha();
   FichaDao fdao = new FichaDao();
int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorFicha</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorFicha at " + request.getContextPath() + "</h1>");
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
       
         String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar"))
        {
            acceso=listadoficha;
        }else if(action.equalsIgnoreCase("agregarficha"))
        {
         acceso = agregarficha;
        }
        else if(action.equalsIgnoreCase("Agregar"))
        {
            
            int Codficha = Integer.parseInt(request.getParameter("txtcodficha"));
            int Cantapre = Integer.parseInt(request.getParameter("txtcantapre"));
               int Codprod = Integer.parseInt(request.getParameter("txtcodprod"));
         
            int Codaprendiz = Integer.parseInt(request.getParameter("txtcodaprendiz"));
        
            f.setCodficha(Codficha);
            f.setCantapre(Cantapre);
            f.setCodprod(Codprod);
            f.setCodaprendiz(Codaprendiz);
            
            fdao.registroficha(f);
            acceso=listadoficha;
       }else if(action.equalsIgnoreCase("eliminar")){
            id =Integer.parseInt(request.getParameter("id"));
            f.setId(id);
            fdao.eliminarficha(id);
            acceso=listadoficha;   
            }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("id",request.getParameter("id"));
            acceso=editarficha;
            }else if(action.equalsIgnoreCase("actualizar")){
            id=Integer.parseInt(request.getParameter("txtId"));
            int Codficha=Integer.parseInt(request.getParameter("txtcodficha"));
            int Cantapre = Integer.parseInt(request.getParameter("txtcantapre"));
            int Codprod = Integer.parseInt(request.getParameter("txtcodprod"));
            int Codaprendiz = Integer.parseInt(request.getParameter("txtcodaprendiz"));
            fdao.actualizarficha(f);
            acceso=listadoficha;
            }
           RequestDispatcher view=request.getRequestDispatcher(acceso);
            view.forward(request, response);
        
            
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
