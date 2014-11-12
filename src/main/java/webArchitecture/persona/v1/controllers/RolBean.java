package webArchitecture.persona.v1.controllers;

import java.util.ArrayList;
import java.util.List;

public class RolBean {
    private List<String> roles;

    private String rol;

    public RolBean() {
        this.roles = new ArrayList<>();
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<String> getRoles() {
        return roles;
    }

    public String process() {
        if (this.rol != null && !this.rol.isEmpty()) {
            this.roles.add(this.rol);
        }
        return "rolForm";
    }

}
