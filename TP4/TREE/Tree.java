public class Tree {
    private Nodo raiz;

    Tree(Nodo n){
        this.raiz = n;
    }

    public void listTree(){
        raiz.show(1);
    }
}
