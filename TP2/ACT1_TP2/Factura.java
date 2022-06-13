import java.time.LocalDate;
import java.util.Vector;

public class Factura {
    Vector<Articulo> va;
    Cliente c;
    Float monto;
    LocalDate fecha;
    Integer num;

    public Factura(Cliente c,LocalDate f, Integer num){
        this.va = new Vector<Articulo>();
        this.c = c;
        this.monto = 0.f;
        this.num = num;
        this.fecha = f;
    }

    public void addArt(Articulo art){
        va.add(art);
        monto += art.precio()*art.cant();
    }

    public Float monto(){
        return monto;
    }
}
