import java.util.Vector;

public class Universidad {
    private Vector<Facultad> facu;
    private String nom;

    Universidad(String n){
        this.facu = new Vector<Facultad>();
        this.nom = n;
    }

    public void addFac(Facultad f){
        facu.add(f);
    }
    
    public void callarWarning(){
        System.out.println(nom);
    }

    public void listarAlumnos(Catedra c){
        for (Facultad f : facu){
            f.listarAlumnos(c);
        }
    }
}
