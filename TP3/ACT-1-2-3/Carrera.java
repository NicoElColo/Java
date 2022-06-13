import java.util.Vector;

public class Carrera {
    private String nom;
    private Vector<Catedra> cat;
    private Vector<Alumno> al;
    private Vector<Docente> doc;

    Carrera(String n){
        this.cat = new Vector<Catedra>();
        this.al = new Vector<Alumno>();
        this.doc = new Vector<Docente>();
        this.nom = n;
    }

    public void addDoc(Docente d){
        doc.add(d);
    }
    
    public void addAl(Alumno a){
        al.add(a);
    }

    public void addCat(Catedra c){
        cat.add(c);
    }

    public void callarWarning(){
        System.out.println(nom);
    }

    public void listar_egresados(){
        System.out.println("Egresados: ");
        for (Alumno a : al){
            if (a.egresado()){
                a.mostrar();
            }
        }
    }

    public void listarAlumnos(Catedra c){
        for (Catedra aux : cat){
            if (aux.equals(c)){
                aux.listarAlumnos();
            }
        }
    }
}