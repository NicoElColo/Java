public abstract class RolUsuarioDTO {
    private UsuarioDTO user;

    public RolUsuarioDTO(UsuarioDTO us){
        this.user = us;
    }

    public Boolean esComensal(){
        return false;
    }

    public abstract void mostrar();
}
