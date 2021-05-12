package ejerciciostp4.CongresoCiencias;

import java.util.List;

public class Poster extends Trabajo{
    Poster(String nombrePoster)
    {
        super(nombrePoster);
    }
    @Override
    public boolean evaluadorApto(Evaluador evaluador) {
        List<String> listaPoster = this.getTemas();
        for (int i = 0; i < listaPoster.size(); i++) {
            if (evaluador.sabeTema(listaPoster.get(i)))
                return true;
        }
        return false;
    }
}
