public abstract class Trabajador {
  private String nombre;
  private String apellido;
  private String direccion;
  private Integer DNI;

  public Trabajador(String nom, String ape, Integer dni, String dir){
    this.nombre = nom;
    this.apellido = ape;
    this.DNI = dni;
    this.direccion = dir;
  }

  public abstract Float calcula_sueldo(Periodo periodo, Historico hs);

  public Boolean isJefe(Jefe jef){
    return false;
  }

  public abstract void mostrar();
  public void mostrarPer(){
    System.out.println("Nombre: " + nombre + " " + apellido + " - DNI: " + DNI.toString() + " / Dir: " + direccion);
  }

}