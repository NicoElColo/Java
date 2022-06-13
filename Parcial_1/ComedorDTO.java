import java.util.Vector;

public class ComedorDTO {
    private String desc;
    private String domi;
    private Vector<Entrega> entregas;

    public ComedorDTO(String d, String dom){
        this.desc = d;
        this.domi = dom;
        this.entregas = new Vector<Entrega>();
    }

    public void addEnt(Entrega ent){
        entregas.add(ent);
    }
}
