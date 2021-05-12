package ejerciciostp2;

public class Electrodomestico {
    private String nombre;
    private int precio;
    private String color;
    private int peso;
    private int consumo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    public Electrodomestico(String nombre)
    {
        this.nombre=nombre;
        this.precio= 100;
        this.color= "gris plata";
        this.consumo= 10;
        this.peso= 2;
    }
    public Electrodomestico(String nombre, int precio, String color, int consumo, int peso)
    {
        this.nombre= nombre;
        this.precio= precio;
        this.color= color;
        this.consumo= consumo;
        this.peso= peso;

    }
    private boolean bajoconsumo()
    {
        if(this.consumo<45)
            return true;
        else
            return false;
    }
    private int balance()
    {
        return (this.precio/this.peso);
    }
    private boolean altagamma()
    {
        if (this.balance()>3)
            return true;
        else
            return false;
    }

}
