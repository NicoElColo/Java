import java.time.LocalDate;

public class Jornada {

  private LocalDate fecha;
  private Integer horas;

  public Jornada(LocalDate fecha, Integer hs) {
    this.fecha = fecha;
    this.horas = hs;
  }

  public Boolean pertenece(Periodo periodo) {
    if (fecha.isAfter(periodo.desde()) && fecha.isBefore(periodo.hasta())) {
      return true;
    }
    return false;
  }

  public Integer horas(){
    return this.horas;
  }

  
}