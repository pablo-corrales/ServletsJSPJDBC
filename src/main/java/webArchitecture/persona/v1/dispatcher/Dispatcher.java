package webArchitecture.persona.v1.dispatcher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webArchitecture.persona.v1.models.entities.Persona;
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
            view = action;
            break;
        case "crearRol":
            CrearRol crearRol = (CrearRol) request.getSession(true).getAttribute(action);
            if (crearRol == null) {
                crearRol = new CrearRol();
                request.getSession(true).setAttribute(action, crearRol);
            }
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
            request.setAttribute(action, crearPersona);
            view = crearPersona.process();
            break;
        case "crearRol":
            CrearRol crearRol = (CrearRol) request.getSession(true).getAttribute(action);
            crearRol.setRol(request.getParameter("rol"));
            view = crearRol.process();
            break;
        }

        this.getServletContext().getRequestDispatcher("/v1Views/" + view + ".jsp")
                .forward(request, response);
    }

}
