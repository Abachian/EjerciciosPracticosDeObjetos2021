package ejerciciostp7.Condiciones;

import ejerciciostp7.Clases.Elemento;

public class CondicionAnd implements Condicion{
    Condicion c1;
    Condicion c2;

    @Override
    public boolean cumple(Elemento e) {
        return (c1.cumple(e)&& c2.cumple(e));
    }
}
