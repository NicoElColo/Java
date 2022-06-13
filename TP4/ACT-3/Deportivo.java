public class Deportivo extends Embarcacion {
    private Float potencia;

    Deportivo(String mat, Float es, Short an, Float po){
        super(mat,es,an);
        this.potencia = po;
    }

    public Float module(){
        return potencia + module_m();
    }
}
