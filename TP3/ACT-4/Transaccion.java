import java.time.LocalDate;

public abstract class Transaccion {
    private LocalDate fecha;

    Transaccion(LocalDate f) {
        this.fecha = f;
    }

    public void mFecha(){
        System.out.println(fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear());
    }
    
    public abstract Float valor();

    public Boolean pertenece(LocalDate desde, LocalDate hasta){
        return (fecha.isAfter(desde) && fecha.isBefore(hasta));
    }
}
