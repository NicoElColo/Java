public class Articulo {
    String nombre;
    Integer cant;
    Float precio;

    public Articulo(String nom, Integer c, Float pre){
        this.nombre = nom;
        this.cant = c;
        this.precio = pre;
    }

    public Integer cant(){
        return cant;
    }

    public Float precio(){
        return precio;
    }
}
