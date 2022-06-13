import java.util.Vector;

public class Local {
    private Vector<Empleado> empleados;
    private Vector<TipoLocal> tipos;
    private String nombre;
    private Float tam;
    private Short piso;
    private Character local;
    private Integer apertura;
    private Integer cerradura;

    Local(String n, Float t, Short p, Character c, Integer ap, Integer cer){
        this.empleados = new Vector<Empleado>();
        this.tipos = new Vector<TipoLocal>();
        this.nombre = n;
        this.tam = t;
        this.piso = p;
        this.local = c;
        this.apertura = ap;
        this.cerradura = cer;
    }

    public void addEmp(Empleado e){
        empleados.add(e);
    }

    public void addTipo(TipoLocal t){
        tipos.add(t);
    }

    public void show(){
        System.out.println("-Nombre: " + nombre + " -Tam: " + tam + "m2 -Ubi: " + piso + " - " + local);
        System.out.println("-Horario: " + apertura + "-" + cerradura);
    }

    public Boolean esBar(){
        for (TipoLocal t : tipos){
            if (t.esBar()){
                return true;
            }
        }
        return false;
    }
}
