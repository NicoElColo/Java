import java.time.LocalDate;
import java.util.Vector;

public class Venta {
    private LocalDate fecha;
    private Float monto;
    private Vector<Detalle> vDeta;
    private Comprador c;

    public Venta(LocalDate fec, Comprador comp){
        this.vDeta = new Vector<Detalle>();
        this.fecha = fec;
        this.monto = 0.f;
        this.c = comp;
    }

    public void addDetalle(Detalle d){
        vDeta.add(d);
        monto += d.precio();
    }

    public Float monto(){
        return monto;
    }

    public Float montoUsados(){
        Float usados = 0.f;
        for(Detalle d:vDeta){
            if (d.esUsado() && d.esNacional()){
                usados += d.precio();
            }
        }
        return usados;
    }
}
