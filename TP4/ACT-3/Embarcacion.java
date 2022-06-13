public abstract class Embarcacion {
    private String matricula;
    private Float eslora;
    private Short anio;
    private static final Float valorFijo = 0.5f;

    Embarcacion(String mat, Float es, Short an){
        this.matricula = mat;
        this.eslora = es;
        this.anio = an;
    }

    public abstract Float module();

    public Float module_m(){
        return eslora*10*valorFijo;
    }
}
