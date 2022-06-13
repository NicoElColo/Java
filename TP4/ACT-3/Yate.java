public class Yate extends Embarcacion {
    private Float potencia;
    private Float numCamarotes;

    Yate(String mat, Float es, Short an, Float po, Float num){
        super(mat,es,an);
        this.potencia = po;
        this.numCamarotes = num;
    }

    public Float module(){
        return potencia + numCamarotes + module_m();
    }
}
