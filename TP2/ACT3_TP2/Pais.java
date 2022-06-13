public class Pais {
    private String lugar;
    private Float impuesto;

    public Pais(String nom, Float imp) {
        this.lugar = nom;
        this.impuesto = imp;
    }

    public Boolean esArgentina(){
        return (lugar == "Argentina");
    }

    public Float impuesto(){
        return impuesto;
    }

}
