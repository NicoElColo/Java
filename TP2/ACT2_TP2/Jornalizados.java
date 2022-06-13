import java.time.LocalDate;
import java.util.Vector;

public class Jornalizados extends Trabajador {

  private Vector<Jornada> myJornada;
  private Jefe myJefe;

  public Jornalizados(String nombre, String apellido,Integer DNI, String direccion, Jefe boss) {
    super(nombre,apellido,DNI,direccion);
    this.myJefe = boss;
    myJornada = new Vector<Jornada>();
  }

  public void addJornada(LocalDate fecha, Integer hs){
    myJornada.addElement(new Jornada(fecha,hs));
  }

  @Override
  public Float calcula_sueldo(Periodo periodo, Historico hs) {
    Integer horas = 0;
    for (Jornada jor : myJornada) {
      if (jor.pertenece(periodo)) {
        horas += jor.horas();
      }
    }
    if (horas < 40) {
      return horas*hs.getMenos40(periodo);
    }
    return horas*hs.getMas40(periodo);
  }

  public Boolean isJefe(Jefe jef){
    return (myJefe.equals(jef));
  }

  @Override
  public void mostrar(){
    System.out.print("Jornado - ");
    this.mostrarPer();
  }


}