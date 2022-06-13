public class RolVentanilaDTO extends RolUsuarioDTO{
    private String clave;
    private ComedorDTO comedor;

    public RolVentanilaDTO(UsuarioDTO user,String cl,ComedorDTO c){
        super(user);
        this.clave = cl;
        this.comedor = c;
    }

    @Override
    public void mostrar(){
        System.out.println(clave);
    }
}
