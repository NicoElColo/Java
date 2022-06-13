import java.time.LocalDate;
import java.util.Vector;

public class Comision {
    private Character letra;
    private LocalDate fecha;
    private Vector<Alumno> al;
    private Docente tit;

    Comision(Character a, LocalDate f,Docente t){
        this.letra = a;
        this.fecha = f;
        this.al = new Vector<Alumno>();
        this.tit = t;
    }

    public void addAl(Alumno a){
        al.add(a);
    }

    public void mostrar(){
        System.out.print("Comision: " + letra);
        System.out.print(" - Docente: ");
        tit.mostrar();

        System.out.println(" - Creacion: " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear());
        for(Alumno a : al){
            a.mostrar();
        }
    }
}
