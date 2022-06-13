import java.time.LocalDate;

public class Deposito extends Transaccion {
    private Monto monto;

    Deposito(LocalDate fecha, Monto m){
        super(fecha);
        this.monto = m;
    }

    @Override
    public Float valor(){
        return monto.valor();
    }
}
