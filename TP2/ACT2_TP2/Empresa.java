import java.util.Vector;

public class Empresa {

  private Vector<Trabajador>  vT;
  Historico reg;

  public Empresa() {
    vT = new Vector<Trabajador>();
    reg = new Historico();
  }

  public void addReg(Periodo p,Float menos40,Float mas40) {
    reg.addReg(p, menos40, mas40);
  }

  public void addTraba(Trabajador tb){
    vT.addElement(tb);
  }

  public void pagar_sueldos(Periodo p){
    Float suma = 0.f;
    for(Trabajador traba : vT){
      suma += traba.calcula_sueldo(p,reg);
    }
    System.out.println(suma);
  }

  public void mostrar(){
    for(Trabajador traba : vT){
      traba.mostrarPer();
    }
  }

  public void listarEmpleadosPorJefe(Jefe jef){
    System.out.println("Jefe: ");
    jef.mostrarPer();
    for(Trabajador traba: vT) {
      if (traba.isJefe(jef)){
        traba.mostrar();
      }
    }
  }
}