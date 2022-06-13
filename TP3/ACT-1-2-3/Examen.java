import java.time.LocalDate;

public class Examen {
    private Alumno al;
    private Catedra cat;
    private Float nota;
    private LocalDate fecha;
    private TipoExamen tipo;

    Examen(Alumno a, Catedra c, TipoExamen t, Float n, LocalDate f){
        this.al = a;
        this.cat = c;
        this.nota = n;
        this.fecha = f;
        this.tipo = t;
    }

    public void mostrar(){
        System.out.println(fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear());
        al.mostrar();
        cat.mostrar();
        tipo.mostrar();
        System.out.print(nota);
    }


}
