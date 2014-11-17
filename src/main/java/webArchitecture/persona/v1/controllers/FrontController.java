package webArchitecture.persona.v1.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webArchitecture.persona.v1.models.entities.Persona;

@WebServlet("/v1/*")
// En 3.0 se utilizan anotaciones en lugar de XML
public class FrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getPathInfo().substring(1);
        String view = "home";

        if (action.equals("crearPersona")) {
            request.setAttribute("personaBean", new PersonaBean());
            view = "personaForm";
        } else if (action.equals("crearRol")) {
            view = "rolForm";
        }

        this.getServletContext().getRequestDispatcher("/v1View/" + view + ".jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getPathInfo().substring(1);
        String view = "home";

        if (action.equals("crearPersona")) {
            PersonaBean pb = new PersonaBean();
            Persona p = new Persona();
            pb.setPersona(p);
            request.setAttribute("personaBean", pb);
            p.setId(Integer.valueOf(request.getParameter("id")));
            p.setNombre(request.getParameter("nombre"));
            p.setRol(request.getParameter("rol"));
            view = pb.process();
        } else if (action.equals("crearRol")) {
            RolBean rb = (RolBean) request.getSession(true).getAttribute("rolBean");
            if (rb == null) {
                rb = new RolBean();
                request.getSession(true).setAttribute("rolBean", rb);
            }
            rb.setRol(request.getParameter("rol"));
            view = rb.process();
        }

        this.getServletContext().getRequestDispatcher("/v1View/" + view + ".jsp")
                .forward(request, response);

    }

}
