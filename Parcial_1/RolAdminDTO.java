public class RolAdminDTO extends RolUsuarioDTO{
    private String clave;

    public RolAdminDTO(UsuarioDTO user, String cl){
        super(user);
        this.clave = cl;
    }

    @Override
    public void mostrar(){
        System.out.println(clave);
    }
}
