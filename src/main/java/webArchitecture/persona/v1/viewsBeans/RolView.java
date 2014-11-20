package webArchitecture.persona.v1.viewsBeans;

public class RolView {
    private String[] roles;

    private String rol;


    public RolView() {
        // Se ataca a la Capa de Negocio para conseguir los roles!!!
        this.roles = new String[] {"uno", "dos", "tres"};
    }

    public String[] getRoles() {
        return roles;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String process() {
        // Se ataca a la Capa de Negocio para actualizar los roles!!!
        return "rol";
    }

}
