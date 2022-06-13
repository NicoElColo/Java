import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private Cliente cliente;
    private Embarcacion barquito;
    private Amarra lugar;
    private LocalDate desde;
    private LocalDate hasta;
    

    Alquiler(Cliente c, Embarcacion b, Amarra a, LocalDate d, LocalDate h){
        this.cliente = c;
        this.barquito = b;
        this.lugar = a;
        this.desde = d;
        this.hasta = h;
    }

    public Float calcula(){
        Long days = ChronoUnit.DAYS.between(desde, hasta) + 1;
        return days*barquito.module();
    }
}
