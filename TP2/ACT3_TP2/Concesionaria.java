import java.util.Vector;

public class Concesionaria {
    private Vector<Vehiculo> vVehi;
    private Vector<Venta> vVenta;

    public Concesionaria(){
        this.vVehi = new Vector<Vehiculo>();
        this.vVenta = new Vector<Venta>();
    }

    public void addVehi(Vehiculo v){
        vVehi.add(v);
    }

    public void addVenta(Venta v){
        vVenta.add(v);
    }

    public Float ventasUsados(){
        Float suma = 0.f;
        for (Venta v: vVenta) {
            suma += v.montoUsados();
        }
        return suma;
    }
}
