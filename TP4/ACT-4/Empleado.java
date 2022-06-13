public class Empleado {
    private String nombre;
    private Integer dni;

    Empleado(String nom, Integer d){
        this.nombre = nom;
        this.dni = d;
    }

    public void show(){
        System.out.println(nombre);
        System.out.println(dni);
    }
}
