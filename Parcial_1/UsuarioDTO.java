import java.util.Vector;

public class UsuarioDTO {
    private Vector<RolUsuarioDTO> roles;
    private String usuario;
    private String apellido;
    private String nombre;
    private String correo;

    public UsuarioDTO(String user, String apell, String nom, String email){
        this.usuario = user;
        this.apellido = apell;
        this.nombre = nom;
        this.correo = email;
        this.roles = new Vector<RolUsuarioDTO>();
    }

    public void addRol(RolUsuarioDTO rol){
        roles.add(rol);
    }

    public void listarComensales(){
        if (roles.size() > 1) {
            for(RolUsuarioDTO rol : roles){
                if(rol.esComensal()){
                    System.out.print(nombre + " " + apellido + " - ");
                    rol.mostrar();
                }
            }
        }
    }
}
