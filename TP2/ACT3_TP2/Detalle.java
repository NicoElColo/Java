public class Detalle {
    private Float precio;
    private Vehiculo vehi;


    public Detalle(Float pre, Vehiculo nave){
        this.precio = pre;
        this.vehi = nave;
    }

    public Boolean esNacional(){
        return vehi.esNacional();
    }

    public Boolean esUsado(){
        return vehi.esUsado();
    }

    public Float precio(){
        return precio;
    }
}
