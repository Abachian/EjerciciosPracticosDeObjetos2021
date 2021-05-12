package ejerciciostp3.estructurasdedatos;

/*public class ColeccionDeElementos {

    Object[]  elementos;
    int ultimo;

    public ColeccionDeElementos() {
        elementos = new Object[1];
        ultimo=0;
    }

    public void agregarElemento(Object o1) {

        elementos[ultimo] = o1;
        ultimo++;
        if (ultimo == elementos.length) {
            System.out.println(" Duplica capaciad " + ultimo + " " + elementos.length);
            Object[] aux = new Object[elementos.length*2];
            for (int i = 0; i<elementos.length; i++) {
                aux[i] = elementos[i];
            }
            elementos = aux;//GARBAGE COLLECTOR
        }
    }

    public Object obtenerElemento(int i) {

        if(i>=0 && i<ultimo) {
            return elementos[i];
        }else {
            return null;
        }

    }

    public int cantidadDeElementos() {
        return ultimo;
    }

    public boolean estaContenido(Object elemento) {

        for (int i = 0; i<this.cantidadDeElementos(); i++) {
            Object o1 = this.obtenerElemento(i);
            if (elemento.equals(o1)) {/////
                return true;
            }
        }
        return false;
    }*/