public class Velero extends Embarcacion {
    private Float mastiles;

    Velero(String mat, Float es, Short an, Float mas){
        super(mat,es,an);
        this.mastiles = mas;
    }

    public Float module(){
        return mastiles + module_m();
    }
}
