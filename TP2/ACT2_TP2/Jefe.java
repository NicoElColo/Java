public class Jefe extends Trabajador {
  private Float sueldo_p;

  public Jefe(String nombre, String apellido,Integer DNI, String direccion, Float sueldo) {
    super(nombre,apellido,DNI,direccion);
    this.sueldo_p = sueldo;
  }

  @Override
  public Float calcula_sueldo(Periodo periodo, Historico hs) {
    return sueldo_p;
  }

  @Override
  public void mostrar(){
    System.out.print("Jefe - ");
    this.mostrarPer();
  }

}