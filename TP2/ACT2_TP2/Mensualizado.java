public class Mensualizado extends Trabajador {

    private Categoria myCategoria;
    private Jefe myJefe;

    public Mensualizado(String nombre, String apellido,Integer DNI, String direccion, Categoria cat,Jefe boss) {
        super(nombre,apellido,DNI,direccion);
        this.myCategoria = cat;
        this.myJefe = boss;
    }

    @Override
    public Float calcula_sueldo(Periodo periodo, Historico hs){
        return myCategoria.sueldo();
    }

    public Boolean isJefe(Jefe jef){
        return myJefe.equals(jef);
    }

    @Override
    public void mostrar(){
        System.out.print("Mensual - ");
        myCategoria.mostrar();
        this.mostrarPer();
    }
}