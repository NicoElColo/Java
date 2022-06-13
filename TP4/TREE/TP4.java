public class TP4{
    public static void main(String args[]){
        Nodo n1 = new Nodo('a');
        Nodo n2 = new Nodo('b');
        Nodo n3 = new Nodo('c');
        Nodo n4 = new Nodo('d');
        Nodo n5 = new Nodo('e');
        Nodo n6 = new Nodo('f');

        n4.addHijo(n3);
        n4.addHijo(n5);

        n1.addHijo(n2);
        n1.addHijo(n4);
        n1.addHijo(n6);

        Tree ar = new Tree(n1);

        ar.listTree();
    }
}