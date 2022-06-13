import java.time.LocalDate;
import java.util.Vector;

public class Cuenta {
    private Titular tit;
    private Integer num;
    private Vector<Transaccion> trans;

    Cuenta(Titular t, Integer n){
        this.tit = t;
        this.trans = new Vector<Transaccion>();
        this.num = n;
    }

    public void addTrans(Transaccion t){
        trans.add(t);
    }

    public void callaWarning(){
        tit.mostrar();
    }

    public Integer numero(){
        return num;
    }

    public Float comision(LocalDate desde, LocalDate hasta){
        Float suma = 0.f;
        Integer cant = 0;
        for(Transaccion t : trans){
            if (t.pertenece(desde, hasta)){
                Float valor = t.valor();
                suma += valor;

                //Si el valor es 0 es una consulta y no hay que contarla en la cotizacion
                if (valor != 0){
                    cant++;
                }
            }
        }
        
        return (float) (30-((suma/cant) * 0.005));
    }
}
