import java.util.Vector;

public class Facultad {
    private Vector<Carrera> car;
    private String nom;

    Facultad(String n){
        this.car = new Vector<Carrera>();
        this.nom = n;
    }

    public void addCarrera(Carrera c){
        car.add(c);
    }

    public void callarWarning(){
        System.out.println(nom);
    }

    public void listarAlumnos(Catedra cat){
        for (Carrera c : car) {
            c.listarAlumnos(cat);
        }
    }
}
