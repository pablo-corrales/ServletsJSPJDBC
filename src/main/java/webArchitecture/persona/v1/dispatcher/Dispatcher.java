package webArchitecture.persona.v1.dispatcher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webArchitecture.persona.v1.models.entities.Persona;
import webArchitecture.persona.v1.models.entities.Roles;
import webArchitecture.persona.v1.viewsBeans.CrearPersona;
import webArchitecture.persona.v1.viewsBeans.CrearRol;

@WebServlet("/v1/*")
// En 3.0 se utilizan anotaciones en lugar de XML
public class Dispatcher extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getPathInfo().substring(1);

        String view;
        switch (action) {
        case "crearPersona":
            CrearPersona crearPersona = new CrearPersona();
            crearPersona.setPersona(new Persona());
            crearPersona.setRoles((Roles) request.getSession(true).getAttribute("roles"));
            request.setAttribute(action, crearPersona);
            view = action;
            break;
        case "crearRol":
            Roles roles = (Roles) request.getSession(true).getAttribute("roles");
            if (roles == null) {
                roles = new Roles();
                request.getSession(true).setAttribute("roles", roles);
            }
            CrearRol crearRol= new CrearRol();
            crearRol.setRoles(roles);
            request.setAttribute(action, crearRol);
            view = action;
            break;
        default:
            view = "home";
        }

        this.getServletContext().getRequestDispatcher("/v1Views/" + view + ".jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getPathInfo().substring(1);
        String view = "home";
        switch (action) {
        case "crearPersona":
            Persona persona = new Persona();
            persona.setId(Integer.valueOf(request.getParameter("id")));
            persona.setNombre(request.getParameter("nombre"));
            persona.setRol(request.getParameter("rol"));
            CrearPersona crearPersona = new CrearPersona();
            crearPersona.setPersona(persona);
            crearPersona.setRoles((Roles) request.getSession().getAttribute("roles"));
            request.setAttribute(action, crearPersona);
            view = crearPersona.process();
            break;
        case "crearRol":
            CrearRol crearRol = new CrearRol();
            Roles roles = (Roles) request.getSession().getAttribute("roles");
            crearRol.setRoles(roles);
            crearRol.setRol(request.getParameter("rol"));
            request.setAttribute(action, crearRol);
            view = crearRol.process();
            //request.getSession(true).setAttribute("roles", roles);
            break;
        }

        this.getServletContext().getRequestDispatcher("/v1Views/" + view + ".jsp")
                .forward(request, response);
    }

}
