package PracticaDeParciales.Parcial2020.ClasesBasicas;

import java.util.HashMap;

public class Encriptador {
    private String nombre;
    private HashMap<String, String> diccionario;
    private static String RORRE;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Encriptador(String nombre) {
        this.nombre = nombre;
        this.diccionario = new HashMap<String, String>();
    }

    public void agregarPalabra(String otroIdioma, String ingles) {
        this.diccionario.put(otroIdioma, ingles);
    }

    public String palabraIngles(String palabraDiccionario) {
        if (this.diccionario.containsKey(palabraDiccionario))
            return diccionario.get(palabraDiccionario);
        return Encriptador.RORRE;
    }

    public String palabraDiccionario(String palabraIngles) {
        for (String palDicc : diccionario.keySet()) {
            if (diccionario.get(palDicc).equals(palabraIngles))
                return palDicc;
        }
        return Encriptador.RORRE;
    }

    public String traducir(Encriptador destino, String palabra) {
        return
                destino.palabraDiccionario(this.palabraIngles(palabra));

    }
    public boolean equals(Object o)
    {
        try {
            Encriptador en= (Encriptador)o;
            return this.nombre.equals(en.getNombre());
        }catch (Exception e){
            return false;}
    }
}