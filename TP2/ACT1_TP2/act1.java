import java.time.LocalDate;

public class act1 {
    public static void main(String args[]){
        Empresa a1 = new Empresa();

        Cliente c = new Cliente("juanito perez", 20430370929.f);
        Factura f = new Factura(c,LocalDate.now(),00000001);

        Articulo art1 = new Articulo("birome", 50, 50.f);
        Articulo art2 = new Articulo("cuadernillo", 20, 300.f);

        f.addArt(art1);
        f.addArt(art2);

        a1.Facturar(f);
        System.out.println(a1.totalFac());

    }
}