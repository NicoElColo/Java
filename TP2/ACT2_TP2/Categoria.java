public class Categoria {

  private String nombre;
  private Float sueldo;

  public Categoria(String nom, Float sueldo) {
    this.nombre = nom;
    this.sueldo = sueldo;
  }

  public Float sueldo(){
    return sueldo;
  }

  public void mostrar(){
    System.out.print("Categoria: " + nombre + " - Sueldo: " + sueldo + " ");
  }
}