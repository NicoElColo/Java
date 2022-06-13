import java.util.Vector;

public class Empresa {
    private Vector<Factura> vc;

    public Empresa(){
        vc = new Vector<Factura>();
    }

    public void Facturar(Factura f){
        vc.add(f);
    }

    public Float totalFac(){
        Float suma = 0.f;
        for(int i = 0; i < vc.size(); ++i){
            suma += vc.get(i).monto();
        }
        return suma;
    }
}
