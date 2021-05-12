package elementosgeometricos;

public class Punto {
    private double X;
    private double Y;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
    public Punto()
    {
        this.X=0;
        this.Y=0;
    }
    public Punto (double x,double y)
    {
        this.X=x;
        this.Y=y;
    }
    public void Desplazar(double x, double y)
    {
        setX(getX());
    }
    public double distancia(Punto otropunto)
    {
        double x2= otropunto.getX();
        double y2= otropunto.getY();
        return Math.sqrt(Math.pow((getX()-x2),2)+Math.pow((getY()-y2),2));
    }

}
