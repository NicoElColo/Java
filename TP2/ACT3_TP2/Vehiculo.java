public class Vehiculo {
    private String marca;
    private Integer modelo;
    private String patente;
    private Float precio;
    private Integer km;
    private Duenio duenio;

    public Vehiculo(String marca, Integer modelo, String patente, Float precio, Integer km) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.precio = precio;
        this.km = km;
        this.duenio = null;
    }

    public void addDuenio(Duenio d){
        this.duenio = d;
    }

    public Boolean esNacional(){
        return false;
    }

    public Boolean esUsado(){
        return (km != 0);
    }
}
