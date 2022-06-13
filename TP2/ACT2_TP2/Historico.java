import java.util.Vector;

public class Historico {

    Vector<Periodo> registro;
    Vector<Vector<Float>> precio;

    public Historico() {
        registro = new Vector<Periodo>();
        precio = new Vector<Vector<Float>>();
    }

    public void addReg(Periodo p,Float menos40,Float mas40) {
        registro.add(p);
        Vector<Float> v = new Vector<Float>();
        v.add(menos40);
        v.add(mas40);
        precio.add(v);
    }

    public Float getMenos40(Periodo per){
        for (int i = 0; i < registro.size() ; i++) {
            if ((registro.get(i).desde().isEqual(per.desde()) || registro.get(i).desde().isBefore(per.desde()))
            && (registro.get(i).hasta().isEqual(per.hasta()) || registro.get(i).hasta().isAfter(per.hasta()))) {
                return precio.get(i).get(0);
            }
        }
        return 0.f;
    }

    public Float getMas40(Periodo per){
        for (int i = 0; i < registro.size() ; i++) {
            if ((registro.get(i).desde().isEqual(per.desde()) || registro.get(i).desde().isBefore(per.desde()))
            && (registro.get(i).hasta().isEqual(per.hasta()) || registro.get(i).hasta().isAfter(per.hasta()))) {
                return precio.get(i).get(1);
            }
        }
        return 0.f;
    }
    
}
