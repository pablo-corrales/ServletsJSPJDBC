package webArchitecture.persona.v0.views.beans;

import java.io.Serializable;

public class PersonaBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;

    private String nombre;

    private String[] roles;

    public PersonaBean() {
    }

    public PersonaBean(int id, String nombre, String[] caras) {
        this.id = id;
        this.nombre = nombre;
        this.roles = caras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getRoles() {
        return this.roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public void process() {
        if (this.nombre == null) {
            this.nombre = "Demonio";
            this.id = 666;
        } else {
            this.id = this.nombre.length();
        }

        if (this.roles == null) {
            this.roles = new String[] {"admin", "usr", "operator"};
        }
    }

}
