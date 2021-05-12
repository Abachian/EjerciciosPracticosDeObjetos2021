package ejerciciostp4.SistemaDeSiembra;
import java.util.List;

public class Cereal extends Elemento {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Cereal (String nombre)
    {
        this.nombre=nombre;
    }
    public boolean aceptaLote (Lote lote) {
        List<Mineral> minerales = getMinerales();
        for (int i = 0; i < minerales.size(); i++) {
            if (!lote.contieneMineral(minerales.get(i)))
                return false;
        }
        return true;
    }
}

