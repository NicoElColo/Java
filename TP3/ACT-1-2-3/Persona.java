public class Persona {
    private String nom;
    private Integer dni;

    Persona(String n, Integer dni){
        this.nom = n;
        this.dni = dni;
    }

    public void mostrar(){
        System.out.print("Nombre: " + nom + " - DNI: " + dni);
    }
}
