import java.util.Vector;

public class Nodo {
    private Character cha;
    private Vector<Nodo> hijos;

    Nodo(Character c){
        this.cha = c;
        this.hijos = new Vector<Nodo>();
    }

    public void addHijo(Nodo n){
        hijos.add(n);
    }

    public Boolean esHoja(){
        return hijos.isEmpty();
    }

    public void show(Integer level){
        System.out.print("Nivel: " + level + " // ");
        if (this.esHoja()) {
            System.out.println("Hoja: " + cha);
        } else {
            ++level;
            System.out.println("Nodo: " + cha);
            for(Nodo n : hijos){
                n.show(level);
            }
            --level;
        }
    }
}
