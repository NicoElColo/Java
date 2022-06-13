import java.util.Vector;

public class Catedra {
    private Vector<Comision> com;
    private String materia;

    Catedra(String mat){
        this.materia = mat;
        this.com = new Vector<Comision>();
    }

    public void addCom(Comision c){
        com.add(c);
    }

    public void listarAlumnos(){
        System.out.println(materia);
        for (Comision c : com){
            c.mostrar();
        }
    }

    public void mostrar(){
        System.out.print(materia);
    }
}
