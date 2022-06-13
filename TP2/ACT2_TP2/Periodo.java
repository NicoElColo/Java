import java.time.LocalDate;

public class Periodo {
    private LocalDate desde_p;
    private LocalDate hasta_p;

    public Periodo(LocalDate des, LocalDate has) {
        this.desde_p = des;
        this.hasta_p = has;
    }

    public LocalDate desde(){
        return desde_p;
    }

    public LocalDate hasta(){
        return hasta_p;
    }
}
