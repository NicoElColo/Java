import java.time.LocalDate;

public class Alumno {
    private LocalDate ingreso;
    private LocalDate egreso;
    private Persona per;

    Alumno(LocalDate in, LocalDate eg, String nom, Integer DNI){
        this.ingreso = in;
        this.egreso = eg;
        this.per = new Persona(nom, DNI);
    }

    public Boolean egresado(){
        return (egreso != null);
    }

    public void mostrar(){
        per.mostrar();
        System.out.print(" - Ingreso: ");
        System.out.print(ingreso.getDayOfMonth() + "/" + ingreso.getMonthValue() + "/" + ingreso.getYear());
        
        if (egreso == null) {
            System.out.println(" - Cursando");
        } else {
            System.out.print(" - Egreso: ");
            System.out.println(egreso.getDayOfMonth() + "/" + egreso.getMonthValue() + "/" + egreso.getYear());
        }
        
    }
}
