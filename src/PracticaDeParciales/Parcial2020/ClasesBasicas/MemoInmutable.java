package PracticaDeParciales.Parcial2020.ClasesBasicas;

import java.util.List;

public class MemoInmutable extends Memo {
    public MemoInmutable(Encriptador encriptador, List<String> palabras) {
        super(encriptador, palabras);
    }

    @Override
    public Elemento traducir(Encriptador e) {
        MemoInmutable copiaRestringida= new MemoInmutable(this.getEncriptador(),this.getPalabras());
        for (int i=0; i<palabras.size();i++)
            copiaRestringida.agregarPalabra(palabras.get(i));
        return copiaRestringida;
    }
}
