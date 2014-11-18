package webArchitecture.persona.v1.viewsBeans;

import webArchitecture.persona.v1.models.entities.Roles;

public class CrearRol {
    private Roles roles;

    private String rol;


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Roles getRoles() {
        return roles;
    }

    public String process() {
        if (this.rol != null && !this.rol.isEmpty()) {
            this.roles.add(this.rol);
        }
        return "crearRol";
    }

}
