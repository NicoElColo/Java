public class Auto extends Vehiculo {
    private Pais origen;

    public Auto(String marca, Integer modelo, String patente, Float precio, Integer km, Pais p){
        super(marca, modelo, patente, precio, km);
        this.origen = p;
    }



    @Override
    public Boolean esNacional(){
        return origen.esArgentina();
    }
}
