import java.time.LocalDate;

public class Consulta extends Transaccion {
    
    Consulta(LocalDate fecha){
        super(fecha);
    }

    @Override
    public Float valor(){
        return 0.f;
    }
}
