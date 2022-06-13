public class Titular {
    private String nom;
    private String ape;
    private Float cuil;

    Titular(String n, String a, Float c){
        this.nom = n;
        this.ape = a;
        this.cuil = c;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nom + ", " + ape + " -CUIL: " + cuil);
    }
}
