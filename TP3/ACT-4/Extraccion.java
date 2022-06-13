import java.time.LocalDate;

public class Extraccion extends Transaccion {
    private Monto monto;

    Extraccion(LocalDate fecha, Monto m){
        super(fecha);
        this.monto = m;
    }

    @Override
    public Float valor(){
        return monto.valor();
    }
}
