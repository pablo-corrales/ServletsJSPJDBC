package webArchitecture.persona.v1.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            request.setAttribute("personaBean", pb);
            System.out.println("id:"+request.getParameter("id"));
            pb.setId(Integer.valueOf(request.getParameter("id")));
            pb.setNombre(request.getParameter("nombre"));
            view = pb.process();
        } else if (action.equals("crearRol")) {
            view = "rolForm";
        }

        this.getServletContext().getRequestDispatcher("/v1View/" + view + ".jsp")
                .forward(request, response);

    }

}
