import java.time.LocalDate;
import java.util.Vector;

public class Banco {
    private Vector<Cuenta> cuentas;
    private String nom;

    Banco(String n){
        this.cuentas = new Vector<Cuenta>();
        this.nom = n;
    }

    public void addCuenta(Cuenta c){
        cuentas.add(c);
    }

    public Float comision(LocalDate desde, LocalDate hasta){
        for(Cuenta c : cuentas){
            System.out.println(c.numero());
            System.out.println(c.comision(desde,hasta));
        }
        return 0.f;
    }

    public void callaWarning(){
        System.out.println(nom);
    }
}
