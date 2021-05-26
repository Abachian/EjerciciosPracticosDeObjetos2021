package series;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if ((calificacion>=1) && (calificacion<=5))
            this.calificacion = calificacion;
        else
            System.out.println("Cargar un valor valido entre 1 y 5");
    }
    public Episodio(String titulo,String descripcion)
    {
        this.calificacion=-1;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.flag=false;
    }
}
