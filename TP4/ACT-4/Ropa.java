public class Ropa extends TipoLocal {
    private String genero;
    
    Ropa(String gen){
        this.genero = gen;
    }

    public void show(){
        System.out.println(genero);
    }
}
