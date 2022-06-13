import java.util.Vector;

public class Puerto {
    private Vector<Amarra> amarras;
    private Vector<Alquiler> alquileres;

    Puerto(){
        this.amarras = new Vector<Amarra>();
        this.alquileres = new Vector<Alquiler>();
    }

    public void addAma(Amarra a){
        amarras.add(a);
    }

    public void addAlq(Alquiler a){
        alquileres.add(a);
    }
}
