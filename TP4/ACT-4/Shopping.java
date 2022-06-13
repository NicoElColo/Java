import java.util.Vector;

public class Shopping {
    private Vector<Local> locales;

    Shopping(){
        this.locales = new Vector<Local>();
    }

    public void addLocal(Local l){
        locales.add(l);
    }

    public Integer cantBares(){
        Integer cant = 0;
        for (Local l : locales){
            if (l.esBar()){
                cant++;
            }
        }
        return cant;
    }
}
