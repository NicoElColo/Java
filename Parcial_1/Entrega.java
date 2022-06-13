import java.time.LocalDate;

public class Entrega {
    private LocalDate fecha;
    private ComedorDTO comedor;
    private Cupon cupon;
    private RolVentanilaDTO ventanilla;

    public Entrega(LocalDate f, ComedorDTO com, Cupon c, RolVentanilaDTO vent){
        this.fecha = f;
        this.comedor = com;
        this.cupon = c;
        this.ventanilla = vent;
    }
}
