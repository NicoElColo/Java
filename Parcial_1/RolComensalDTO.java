import java.time.LocalDate;
import java.util.Vector;

public class RolComensalDTO extends RolUsuarioDTO{
    private LocalDate ultimoacceso;
    private String tokenSesion;
    private Vector<Cupon> cupones;
    private Facultad facu;

    public RolComensalDTO(UsuarioDTO user, LocalDate ult, String token, Facultad f){
        super(user);
        this.ultimoacceso = ult;
        this.tokenSesion = token;
        this.facu = f;
        this.cupones = new Vector<Cupon>();
    }

    public void addCupon(Cupon cup){
        cupones.add(cup);
    }

    @Override
    public Boolean esComensal(){
        return true;
    }

    @Override
    public void mostrar(){
        facu.mostrar();
        Integer saldo = 0;
        for (Cupon c : cupones){
            if(c.noEntregado()){
                saldo++;
            }
        }
        System.out.println(saldo);
    }
}
