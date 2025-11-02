/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.pokedexweb_sebastianborquez.servlets;

import com.mycompany.pokedexweb_sebastianborquez.dominio.PokemonDTO;
import com.mycompany.pokedexweb_sebastianborquez.dominio.Tipo;
import com.mycompany.pokedexweb_sebastianborquez.persistencia.PokemonDAO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sonic
 */
@WebServlet(name = "PokemonServlet", urlPatterns = {"/PokemonServlet"})
public class PokemonServlet extends HttpServlet {

    private List<PokemonDTO> listaPokemones = new ArrayList<>();
    private PokemonDAO dao = new PokemonDAO();

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
            out.println("<title>Servlet PokemonServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PokemonServlet at " + request.getContextPath() + "</h1>");
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

        request.setAttribute("tipos", Tipo.values());
        request.getRequestDispatcher("/RegistrarPokemon.jsp").forward(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String nombre = request.getParameter("nombre");
        String numeroString = request.getParameter("numero");
        String tipoString = request.getParameter("tipo");
        String urlImagen = request.getParameter("urlImagen");

        HttpSession session = request.getSession();

        int numero = Integer.parseInt(numeroString);

        Tipo tipo = Tipo.valueOf(tipoString.toUpperCase());

        PokemonDTO nuevoPokemon = new PokemonDTO(nombre, numero, tipo, urlImagen);

        List<PokemonDTO> listaPokemones = (List<PokemonDTO>) session.getAttribute("pokemones");

        if (listaPokemones == null) {
            PokemonDAO dao = new PokemonDAO();
            listaPokemones = new ArrayList<>(dao.obtenerNuevosPokemones());
        }

        if (numero < 0) {
            request.setAttribute("mensaje", "Error: Numero no valido, no puede ser menor a 0.");
            doGet(request, response);
            return;
        }

        listaPokemones.add(nuevoPokemon);

        session.setAttribute("pokemones", listaPokemones);

        response.sendRedirect("ListaPokemonServlet");

    }
}
