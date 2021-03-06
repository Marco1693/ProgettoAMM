/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import java.util.ArrayList;
import amm.nerdbook.Classi.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Marco
 */
public class Profilo extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        
         
        
        if(session!=null && 
           session.getAttribute("loggedIn")!=null &&
           session.getAttribute("loggedIn").equals(true)){

            String user = request.getParameter("user");
            
            int userID;

            if(user != null){
                userID = Integer.parseInt(user);
            } else {
                Integer loggedUserID = (Integer)session.getAttribute("loggedUserID");
                userID = loggedUserID;
            }
            
            
            Utente utente = UtenteFactory.getInstance().getUtenteById(userID);
            
            
            if(utente != null){
                /* Prende la lista degli utenti*/ 
                List<Utente> utenti = UtenteFactory.getInstance().getListaUtenti();
                /* Prende la lista dei Gruppi*/
                ArrayList<Gruppo> gruppi = GruppoFactory.getInstance().getListaGruppi();
                
                /* Utente loggato */
                request.setAttribute("utente", utente);
                /* Lista Utenti*/
                request.setAttribute("utenti", utenti);
                /* Lista Gruppi*/
                request.setAttribute("gruppi", gruppi);
                
                request.getRequestDispatcher("profilo.jsp").forward(request, response);
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            }
            if(request.getParameter("modifiche")!= null){
                String modifiche = request.getParameter("modifiche");
                String name = request.getParameter("nome");
                String cognome = request.getParameter("cognome");
                String foto= request.getParameter("immagine");
                String frase = request.getParameter("stato");
                String datan = request.getParameter("data");
                String pass = request.getParameter("pws");
                if(modifiche.equals("change"));
                    utente.setNome(name);
                    utente.setCognome(cognome);
                    utente.setUrlFotoProfilo(foto);
                    utente.setFraseDiPresentazione(frase);
                    utente.setDataNascita(datan);
                    utente.setPassword(pass);
                
                UtenteFactory.getInstance().modificaDati(utente);
                request.getRequestDispatcher("Profilo").forward(request, response);
                
            }
            
        }
        else{
            request.getRequestDispatcher("Login").forward(request, response);
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
