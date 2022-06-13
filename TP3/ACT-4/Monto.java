public class Monto {
    private Float monto;
    private Moneda divisa;

    Monto(Float plata, Moneda money){
        this.monto = plata;
        this.divisa = money;
    }

    public Float valor(){
        //el monto se considera la cantidad de monedas
        //la divisa contiene la cotizacion de dicha moneda con respecto al peso
        return monto*divisa.cotiz();
    }
}
