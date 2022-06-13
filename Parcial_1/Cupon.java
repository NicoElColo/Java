import java.time.LocalDate;

public class Cupon {
    private String ident;
    private LocalDate fechaCompra;
    private Entrega entrega;

    public Cupon(String i, LocalDate fecha, Entrega ent){
        this.ident = i;
        this.fechaCompra = fecha;
        this.entrega = ent;
    }

    public Boolean noEntregado(){
        Boolean aux = false;
        if (entrega.equals(null)){
            aux = true;
        }
        return aux;
    }

    public void entregar(Entrega e){
        this.entrega = e;
    }
}
